package lv1;

import java.util.Arrays;

public class TheNumberOfPY {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12916
    boolean solution(String s) {
        boolean answer = countP(s) == countY(s) ;
        // System.out.println(answer);
        return answer;
    }

    public int countP(String s) {
        String[] word = s.split("");
        int p = 0;

        for (int i = 0; i < word.length ; i++) {
            // .equals : uppercase != lowercase
            if (word[i].equals("p") || word[i].equals("P") ) {
                p++;
            }
        }
        return p;

    }

    public int countY(String s) {
        String[] word = s.split("");
        int y = 0;

        for (int i = 0; i < word.length ; i++) {
            // .equals : uppercase != lowercase
            if (word[i].equals("y") || word[i].equals("Y") ) {
                y++;
            }
        }
        return y;

    }

    // Using Lambda
    // .toLowercase / .toUppercase : Unification of Uppercase and Lowercase to simplify
    boolean lambda(String s) {
        s = s.toUpperCase();
        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }
    //

    public static void main(String[] args) {

        new TheNumberOfPY().solution("pPoooyY");
    }
}
