package com.example.programmers.lv0.method;

public class FloatToInt {
    public int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }

    public static void main(String[] args) {
        FloatToInt floatToInt = new FloatToInt();
        System.out.println(floatToInt.solution(2.345));
    }
}
