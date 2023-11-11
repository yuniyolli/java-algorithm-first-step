package com.example.programmers.lv0.string;

import java.util.Arrays;

public class SplitBySpace {
    public String[] solution(String my_string) {
       // String[] answer =  my_string.split(" ");
        return Arrays.stream(my_string.split(" ")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        new SplitBySpace().solution("IS IT POSSIBLE FOR ME TO WORK AS A PROGRAMMER?");
    }

        /*
        // try using foreach -> fail
        String[] answer = new String[3];
        for(Object answers : Arrays.stream(my_string.split(" "))
                .toArray())

            System.out.println(answers);
        return answer;
    }

    public static void main(String[] args) {
        new SplitBySpace().solution("i love you");
    }

         */
}
