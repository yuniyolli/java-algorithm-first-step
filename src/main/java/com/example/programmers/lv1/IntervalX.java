package com.example.programmers.lv1;

public class IntervalX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            // answer[i] = (x + (x * i));
            answer[i] = answer[i - 1] + x;
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {

        new IntervalX().solution(10000000, 1000);
    }
}
