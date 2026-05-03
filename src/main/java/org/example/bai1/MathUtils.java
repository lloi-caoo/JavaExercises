package org.example.bai1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khởi tạo Logger từ thư viện slf4j (được Logback hỗ trợ ở dưới)
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int add(int a, int b) {
        // Thay vì dùng System.out.println, ta dùng logger
        logger.info("Thực hiện phép tính tổng: {} + {}", a, b);
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        logger.info("Kết quả là: {}", result);
    }
}