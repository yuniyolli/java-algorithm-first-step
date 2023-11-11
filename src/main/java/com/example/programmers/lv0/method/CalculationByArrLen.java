package com.example.programmers.lv0.method;

public class CalculationByArrLen {
    /*

     */
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int cnt = 0;
        // arr의 길이가 홀수라면
        if (arr.length % 2 != 0 ) {
            // arr짝수 인덱스 + n
            for (int i = 0; i < arr.length ; i++) {
                if (i % 2 == 0) {
                    answer[cnt] = arr[i] + n;
                } else answer[cnt] = arr[i];
                cnt++;
            }
            // arr의 길이가 짝수라면
        } else {
            for (int i = 0; i < arr.length ; i++) {
                // arr홀수 인덱스 + n
                if (i % 2 != 0) {
                    answer[cnt] = arr[i] + n;
                } else answer[cnt] = arr[i];

                cnt++;
            }
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        CalculationByArrLen calculationByArrLen = new CalculationByArrLen();
        calculationByArrLen.solution(new int[]{49, 12, 100, 276, 33}, 27);
        calculationByArrLen.solution(new int[]{444, 555, 666, 777}, 100);

    }
}
