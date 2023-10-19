/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lamth.mathutil.main;

import com.lamth.mathutil.core.MathUtility;

/**
 *
 * @author lamth
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int n = 0; //hàm ý kiểm tra 0!
        long expected = 1;// hàm ý rằng,hy vọng
        long actual = MathUtility.getFactorial(n);
        //so sánh giữa expected == actual hay k
        System.out.println(n + "!-> expected: " + expected + " actual: " + actual);

        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n); //5!
        System.out.println(n + "! -> expected: " + expected + "! actual: " + actual);
    }
}

//DEV VIẾT CODE HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM TEST CODE CỦA MÌNH
//CÓ 3 CÁCH TEST CODE CỦA CHÍNH MÌNH
//C1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM

//C2: IN RA LOGFILE

//C3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO!!!!!!!!!11

//DÙ LÀ KIỂM THỬ KIỀU NÀO THÌ CŨNG GỒM 3 CÔNG VIỆC
//1. THIẾT KẾ TEST CASE
//2. THỰC THI TEST CASE ( TEST RUN) VÀ GHI BUG NẾU CÓ (LOG BUG)

//TEST CASE LÀ BỘ DATA ĐƯA VÀO APP ĐỂ XEM APP XỬ LÝ ĐÚNG KHÔNG 
//              KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ DK
//              KÈM THÊM HƯỚNG DẪN SỬ DỤNG APP VỚI DATA ĐƯA VÀO
//              KÈM THÊM TRẠNG THÁI CỦA TEST CASE APP ĐÚNG HAY SAI

// CẤU TRỨC CỦA 1 TEST CASE

//MỘT TEST CASE GÔM NHỮNG THÔNG TIN SAU:
//TEST CASE ID: TEST CASE DESCRIPTION : STEPS/PROCEDURES
//EXPECTED RESULT: STATUS (PASSED | FAILED)

//TEST CASE là tình huống xài app với bộ data đưa vào và giá trị kì vọng app phải trả về 
//Giờ ta muốn test hàm getF() ta phải theiét kế các test case coi xem hàm có trả về đúng không

//TEST CASE £1: VERÌYING getFactỏial (with n = 0) check 0! corect or not ?
//TEST STEPS/PROCEDUES
//      1. GIVEN n = 0
//      2.Call/invoke getFactỏial(n = 0)

//EXPECTED RESULT:
//      the method must return 1 as the result of 0!

//STATUS: PASSED | FAILED, just