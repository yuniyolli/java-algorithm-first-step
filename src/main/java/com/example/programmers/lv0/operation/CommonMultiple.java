package com.example.programmers.lv0.operation;

public class CommonMultiple {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        CommonMultiple commonMultiple = new CommonMultiple();
        System.out.println(commonMultiple.solution(60, 2, 3));
    }
}
