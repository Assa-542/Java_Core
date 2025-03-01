import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 0, 1, 2, 3, 0, 1};
        
        int packedData = 0;
        for (int i = 0; i < 9; i++) {
            packedData |= (numbers[i] & 0b11) << (i * 2);
        }

        try (FileOutputStream fos = new FileOutputStream("arrayData.bin")) {
            fos.write((packedData >> 16) & 0xFF);
            fos.write((packedData >> 8) & 0xFF);
            fos.write(packedData & 0xFF);
            System.out.println("Данные успешно записаны в arrayData.bin!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
