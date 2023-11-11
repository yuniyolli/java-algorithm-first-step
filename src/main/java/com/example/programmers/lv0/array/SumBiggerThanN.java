package com.example.programmers.lv0.array;

public class SumBiggerThanN {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int cnt = 0;
        while (answer <= n) {
            answer += numbers[cnt];
            cnt++;
        }
        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new SumBiggerThanN()
                .solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
    }
}
