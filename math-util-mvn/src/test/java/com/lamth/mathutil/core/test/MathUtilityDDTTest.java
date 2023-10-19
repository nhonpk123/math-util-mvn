/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lamth.mathutil.core.test;

import com.lamth.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author lamth
 */
public class MathUtilityDDTTest {
    // ta cần chuẩn bị bộ data để nhồi vào cái hàm qua 2 tham số
    // đã chừa sẵn !!!
    //kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    // để data ở riêng 1 chỗ, từ từ fill vòa hàm so sánh
    //kĩ thuật này gọi là DDT DATA DRIVEN TESTING
    ////1 cái là đầu vào n, 1 cái là expected
    //và có nhiều cặp như thế
    // kĩ thuật này còn goi là tham số hóa kiểm thử
    //đưa data vài qua tham số hàm

    public static Object[][] initData() {
        Object[][] dataSet = {{0, 1},
        {1, 1},
        {3, 6},
        {4, 24},
        {5, 120}};
        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgument0ReturnsOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
