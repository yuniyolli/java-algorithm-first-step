package com.example.programmers.lv0;

public class RepeatString {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        RepeatString repeatString = new RepeatString();
        repeatString.solution("love", 3);
    }
}
