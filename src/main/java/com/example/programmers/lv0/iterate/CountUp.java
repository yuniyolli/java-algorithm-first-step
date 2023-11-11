package com.example.programmers.lv0.iterate;

public class CountUp {
    public int[] solution(int start, int end) {
        int[] answer = new int[(end + 1) - start] ;
        int count = 0;
        for (int i = start; i < end + 1; i++) {
            answer[count] += i;
            count++;
        }
        return answer;
    }
}