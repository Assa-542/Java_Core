package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        createBackup();

        int[] array = {0, 1, 2, 3, 0, 1, 2, 3, 0};
        writeArrayToFile(array, "arrayData.bin");
    }

    public static void createBackup() {
        File sourceDir = new File(".");
        File backupDir = new File("./backup");

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = sourceDir.listFiles((dir, name) -> new File(dir, name).isFile());

        if (files != null) {
            for (File file : files) {
                try {
                    Files.copy(file.toPath(), 
                               new File(backupDir, file.getName()).toPath(), 
                               StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Скопирован: " + file.getName());
                } catch (IOException e) {
                    System.out.println("Ошибка копирования файла: " + file.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeArrayToFile(int[] array, String fileName) {
        if (array.length != 9) {
            System.out.println("Массив должен содержать ровно 9 элементов.");
            return;
        }

        byte[] bytes = new byte[3];
        int bitIndex = 0;

        for (int num : array) {
            if (num < 0 || num > 3) {
                System.out.println("Числа должны быть в диапазоне от 0 до 3.");
                return;
            }

            int byteIndex = bitIndex / 8;
            int shift = 6 - (bitIndex % 8);
            bytes[byteIndex] |= (num << shift);
            bitIndex += 2;
        }

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(bytes);
            System.out.println("Массив успешно записан в " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }
    }
}
