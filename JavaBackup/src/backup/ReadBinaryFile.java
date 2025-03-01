import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        String filePath = "arrayData.bin";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byte1 = fis.read();
            int byte2 = fis.read();
            int byte3 = fis.read();

            if (byte1 == -1 || byte2 == -1 || byte3 == -1) {
                System.out.println("Ошибка: файл пустой или повреждён.");
                return;
            }

            int packedData = (byte1 << 16) | (byte2 << 8) | byte3;
            int[] numbers = new int[9];

            for (int i = 0; i < 9; i++) {
                numbers[i] = (packedData >> (i * 2)) & 0b11;
            }

            System.out.print("Прочитанные данные: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            System.out.println("\nПоле 3x3:");
            for (int i = 0; i < 9; i++) {
                System.out.print(numbers[i] + " ");
                if ((i + 1) % 3 == 0) System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
