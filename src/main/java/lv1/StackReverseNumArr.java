package lv1;

import java.util.Arrays;
import java.util.Stack;

public class StackReverseNumArr {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < str.length() ; i++) {
            //char next = str.charAt(i);
            charStack.push(str.charAt(i));
            if (i == str.length() - 1) {
                for (int j = 0; j < str.length(); j++) {
                    answer[j] = Integer.parseInt(String.valueOf(charStack.pop()));
                    System.out.println(Arrays.toString(answer));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        new StackReverseNumArr().solution(12345);
    }
}

/*
쉬운 풀이
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
 */