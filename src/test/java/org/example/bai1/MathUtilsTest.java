package org.example.bai1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        // Kiểm tra xem 5 + 7 có thực sự bằng 12 không
        int expected = 22;
        int actual = MathUtils.add(5, 7);
        assertEquals(expected, actual, "Hàm cộng hoạt động sai!");
    }
}