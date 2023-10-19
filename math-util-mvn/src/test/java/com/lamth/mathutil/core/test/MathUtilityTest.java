package com.lamth.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.lamth.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lamth
 */
public class MathUtilityTest {
    //Test Case 1: verifying getFactorial(with n=0)
    //steps/procedures:
    //      1.Given n = 0
    //      2. Call/invole getFactorial(n=0)
    //Expected resu;t:
    //      the method must return 1 as the result of 0! = 1
    //Status:PASSED | FAILED  chờ lúc chạy hàm mới biết trạng thái đúng sai
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
        @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
}
