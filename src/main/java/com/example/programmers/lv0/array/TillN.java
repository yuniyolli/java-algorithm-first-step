package com.example.programmers.lv0.array;

import java.util.Arrays;

public class TillN {
    public int[] solution(int[] num_list, int n) {
       // int[] answer = {}; -> 초기화 필요
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] += num_list[i];
//answer = Arrays.copyOfRange(num_list,0,n);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        TillN tillN = new TillN();
        tillN.solution(new int[]{1, 2, 3, 4}, 2);
    }
}
