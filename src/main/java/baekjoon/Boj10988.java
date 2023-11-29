package baekjoon;

import java.util.Scanner;

// Palindrom algorithm
public class Boj10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");
        int len = arr.length - 1;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (!arr[i].equals(arr[len - i])) {
                cnt = 0;
                System.out.println(cnt);
                break;
            } else {
                cnt += 1;
            }
        }
        if (cnt == len) {
            System.out.println(1);
        }

    }
}
