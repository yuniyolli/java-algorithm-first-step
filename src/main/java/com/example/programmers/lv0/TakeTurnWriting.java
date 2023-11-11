package com.example.programmers.lv0;

public class TakeTurnWriting{
        public String solution(String str1, String str2) {
            String answer = "";
            String[] strArr1 = str1.split("");
            String[] strArr2 = str2.split("");

            for (int i = 0; i < strArr1.length ; i++) {
                answer += strArr1[i] + strArr2[i];
                //System.out.print(strArr1[i]);
                //System.out.print(strArr2[i]);
            }

            return answer;
        }

    public static void main(String[] args) {
            TakeTurnWriting takeTurnWriting = new TakeTurnWriting();
        System.out.println(takeTurnWriting.solution("aac","bbd"));

    }
}
