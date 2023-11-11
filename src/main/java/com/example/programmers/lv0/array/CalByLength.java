package com.example.programmers.lv0.array;

public class CalByLength {
    public int solution(int[] num_list) {
        int answer = 0;
        int answerMultiple = 1;
            if (num_list.length >= 11) {
                //? answer *= num_list[i] : answer += num_list[i])
                //for (int sumarr : num_list)
                for (int i = 0; i < num_list.length ; i++) {

                    answer += num_list[i];
                }

                } else {
                for (int i = 0; i < num_list.length; i++) {

                    answerMultiple  *=  num_list[i];
                    answer = answerMultiple;
                }
            }
        System.out.println(answer);
            return answer;
    }

    public static void main(String[] args) {
        new CalByLength().solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
    }
}
