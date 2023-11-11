package com.example.programmers.lv1;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        String[] arrAnswer = phone_number.split(answer);
        for( int i = 0 ; i < (phone_number.length() - 4) ; i++) {
            arrAnswer[i] = "*";
        }
        for (String result : arrAnswer) {
            answer += result;
        }
        return answer;
    }
}
/*
    public String solution(String phone_number) {
        String answer = "";
        String[] arrAnswer = phone_number.split();
        for(i = 0 ; i = phone_number.length() - 4 ; i++) {
            arrAnser[i] = "*";
        }
        for (String result : arrAnswer)
        return result;
    }
 */

// replaceAll 쓰려다 실패 -> 찾아보니 정규식이 필요함
//     return phone_number.replaceAll(".(?=.{4})", "*"); //한줄로 해결

// 기타 풀이 (toCharArray, substring등 활용)
/*
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
 */

/*
class Solution {
  public String solution(String phone_number) {
      String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++)
            answer += "*";

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
  }
}
 */