package com.example.programmers.lv0.condition;

public class BooleanFlag {
    public int solution(int a, int b, boolean flag) {
        int answer = (flag == true)  ? a + b : a - b ;

        return answer;
    }
}
