package org.example.bai4;

import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUtilsTest {

    @Test
    public void testLogPath() {
        // Paths.get() là API chuẩn, nó tự động nội suy dấu phân cách đúng với HĐH đang chạy
        String expectedPath = Paths.get("logs", "app.log").toString();
        String actualPath = FileUtils.createLogPath("logs", "app.log");

        assertEquals(expectedPath, actualPath, "Đường dẫn bị sai do xung đột hệ điều hành!");
    }
}