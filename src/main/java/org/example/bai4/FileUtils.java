package org.example.bai4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    // Đã Refactor: Sử dụng thư viện chuẩn để tự động xử lý dấu phân cách
    public static String createLogPath(String folder, String fileName) {
        Path path = Paths.get(folder, fileName);
        return path.toString();
    }
}