package baekjoon;

import java.util.Scanner;

public class Boj11720 {
    /*
    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
    입력으로 주어진 숫자 N개의 합을 출력한다.

11
10987654321
:: 46
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLen = sc.nextInt();
        String num = sc.next();
        char[] arr = num.toCharArray();
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] - 48; // Or + '0'
        }
        System.out.println(answer);
    }




}
