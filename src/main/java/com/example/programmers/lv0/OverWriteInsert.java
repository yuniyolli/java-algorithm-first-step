package com.example.programmers.lv0;

public class OverWriteInsert {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";
            String mstr1 = my_string.substring(0, s);
            String mstr2 = my_string.substring(s);

            answer = mstr1 + overwrite_string + mstr2;
            return answer;
        }


        public static void main(String[] args) {
            OverWriteInsert overWrite = new OverWriteInsert();
            overWrite.solution("Incredible day", "y happy", 7);
            System.out.println(overWrite.solution("Incredible day", "y happy", 9));

        }
    }

//}
