package com.example.programmers.lv0;

public class ParseStringInt {
    public int solution(int a, int b) {
        //int answer = 0;
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);

        int aPb = Integer.parseInt(aa + bb);
        int bPa = Integer.parseInt(bb + aa);

        int answer = (aPb >= bPa? aPb : bPa);
        //System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        ParseStringInt parseStringInt = new ParseStringInt();
        //parseStringInt.solution(15, 9);
        System.out.println(parseStringInt.solution(15,9));
    }
}
