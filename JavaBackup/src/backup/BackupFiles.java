import java.io.*;

public class BackupFiles {
    public static void main(String[] args) {
        File sourceDir = new File(".");
        File backupDir = new File("./backup");

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = sourceDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    copyFile(file, new File(backupDir, file.getName()));
                }
            }
        }
        System.out.println("Резервное копирование завершено!");
    }

    private static void copyFile(File source, File destination) {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        }
    }
}
