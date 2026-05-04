package org.example.bai1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khởi tạo Logger từ thư viện slf4j (được Logback hỗ trợ ở dưới)
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);
    // Thêm hàm khởi tạo private để che giấu Constructor mặc định
    private MathUtils() {
        throw new UnsupportedOperationException("Đây là class tiện ích, không được tạo đối tượng!");
    }
    public static int add(int a, int b) {
        // Thay vì dùng System.out.println, ta dùng logger
        logger.info("Thực hiện phép tính tổng: {} + {}", a, b);
        return a + b;
    }
}