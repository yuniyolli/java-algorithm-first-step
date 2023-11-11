package com.example.programmers.lv1;

public class ExceptMin {
    public int[] solution(int[] arr) {
        // 길이로 -1리턴
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            // 가장 작은 값 찾기
            int[] answer = new int[arr.length - 1];
            int minArr = 0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[minArr]) {
                    minArr = i;
            }
            }
            int minVal = arr[minArr];
            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > minVal) {
                    answer[idx] += arr[i];
                    idx++;
                }
            }

            return answer;
        }
    }
}
