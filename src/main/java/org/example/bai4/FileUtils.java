package org.example.bai4;

public class FileUtils {
    // Cố tình code "chết" dấu gạch chéo của Windows
    public static String createLogPath(String folder, String fileName) {
        return folder + "\\" + fileName;
    }
}