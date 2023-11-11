package com.example.programmers.lv0;

import java.util.Scanner;

public class ShiftString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
       //String str = "abcde";

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

    }
}
