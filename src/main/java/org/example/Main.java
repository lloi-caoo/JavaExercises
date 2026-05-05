package org.example;

import org.example.bai1.MathUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("  CHƯƠNG TRÌNH ĐÃ KHỞI CHẠY THÀNH CÔNG TỪ FILE .JAR!  ");
        System.out.println("======================================================");

        // Gọi thử tính năng của Bài 1 để chứng minh file jar hoạt động
        int ketQua = MathUtils.add(5, 7);
        System.out.println("Thử nghiệm MathUtils: 5 + 7 = " + ketQua);
    }
}