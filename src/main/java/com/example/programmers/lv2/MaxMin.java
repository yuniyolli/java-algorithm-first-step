package com.example.programmers.lv2;

public class MaxMin {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
// min, max를 0으로 했을 때 문제가 생겨서 이중for했음.(최대값이 음수인 경우)
// 하지만 0번째 배열로 설정을 바꾸었기 때문에 이중for할필요 없음
        for (int i = 0; i < arr.length; i++) {
            int strToInt = Integer.parseInt(arr[i]);
            if (strToInt > max) max = strToInt;
            if (strToInt < min) min  = strToInt;
        }

        // 기존 for문
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = Integer.parseInt(arr[i]);
                int numNext = Integer.parseInt(arr[j]);
                if (numNext > max) max = numNext;
                if (numNext < min) min = numNext;
            }

        }

        return min + " " + max;
    }
}
