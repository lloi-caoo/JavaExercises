package org.example.bai2;

import org.junit.jupiter.api.Test;

public class BankSystemTest {

    @Test
    public void testRutTienHopLe() {
        BankSystem bank = new BankSystem();
        // Rút số tiền nhỏ hơn số dư mặc định (1000) để kích hoạt nhánh báo thành công
        bank.withdrawMoney(500);
    }

    @Test
    public void testRutTienVuotQuaSoDu() {
        BankSystem bank = new BankSystem();
        // Rút số tiền lớn hơn số dư mặc định để kích hoạt nhánh "Giao dịch từ chối"
        bank.withdrawMoney(2000);
    }
}