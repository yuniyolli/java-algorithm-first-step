package com.example.programmers.lv1;

// 정수 n 입력되었을 때
// answer = n의 각 자리수의 합

public class DigitSum {
    int solution(int n) {
        int answer = 0;
/*
         n = 123;
        int hund = n % 100; // 1
        int one =  n % 10 ; // 12...3
        int ten = one % 10; // 1...2


 */
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum();
        digitSum.solution(123);
    }
}
