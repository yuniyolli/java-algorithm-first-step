package com.example.programmers.lv0;

public class OverWriteSolution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String mstr1 = my_string.substring(0, s);
        int overWriteLen = overwrite_string.length();
        String mstr2 = my_string.substring(s + overWriteLen);

        answer = mstr1 + overwrite_string + mstr2;
        return answer;
    }

    public static void main(String[] args) {
        OverWriteMood overWriteMood = new OverWriteMood();
        OverWriteSolution overWrite = new OverWriteSolution();
        //overWrite.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(overWrite.solution("He11oWor1d", "lloWorl", 2));

        String result = overWriteMood.moodOfDay("What a happy day", "wonderful");
        System.out.println(result);
    }
}
