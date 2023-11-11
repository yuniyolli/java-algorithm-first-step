package com.example.programmers.lv0.string;

import java.util.Arrays;

public class ArrayLowerUpper {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            answer[i] = (i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase() );
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        new ArrayLowerUpper().solution(new String[] {"AAA","BBB","CCC","DDD"});
    }
}
