package lv0;

import java.util.Scanner;

public class UpperLowerShift {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String[] arr = a.split("");

            for (int i = 0; i < arr.length; i++) {
                char c = arr[i].charAt(0);
                if(c >= 60 && c <= 90) {
                    c = (char) (c + 32);
                    System.out.print(c);
            } else if (c >= 97 && c <= 122) {
                    c = (char) (c - 32);
                    System.out.print(c);
                }


        }
}
}
