package com.example.programmers.lv1;

public class Watermelon {
    public String solution(int n) {
        // n % 2 == 0 일때, 수박.repeat(n / 2)
        // n % 2 != 0 일때, 수박.repeat(n / 2).concat("수")
        String answer = n % 2 == 0? "수박".repeat(n / 2) : "수박".repeat(n / 2).concat("수");
        return answer;
    }
}
