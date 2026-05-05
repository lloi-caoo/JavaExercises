package org.example.bai2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankSystem {
    // 1. Khởi tạo Logger (Sử dụng thư viện đã cài ở Bài 1)
    private static final Logger logger = LoggerFactory.getLogger(BankSystem.class);

    private int balance = 1000;

    public void withdrawMoney(int amount) {
        if(amount > balance) {
            // Thay System.out bằng logger.warn cho tình huống bất thường
            logger.warn("Giao dịch từ chối: Yêu cầu rút {}, nhưng số dư chỉ còn {}", amount, balance);
        } else {
            balance -= amount;
            // Dùng logger.info cho luồng hoạt động bình thường
            logger.info("Giao dịch thành công: Rút {}. Số dư mới: {}", amount, balance);
        }
    }
}