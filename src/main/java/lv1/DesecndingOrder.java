package lv1;

import java.util.Arrays;

// 내림차순
public class DesecndingOrder {
    // bubble sort!
    public long solution(long n) {
        long answer = 0;
        String strs = "";
        String[] str = String.valueOf(n).split("");
        for (int i = 0; i < str.length ; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if ((Long.parseLong(str[j]) > Long.parseLong(str[i]))) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(str));

        for (String s : str) {
            strs += s;
        }
        //System.out.println(strs);

        answer = Long.parseLong(strs);

        // long 으로 변환은 제일 마지막에
        // long으로 선 변환하여 배열 생성 시
        // 마지막 foreach문으로 숫자 정리 시, 덧셈이 되어버림
        /*
        String[] str = Long.toString(n).split("");
        long[] arrN = new long[str.length];
        for (int i = 0; i < str.length ; i++) {
            arrN[i] = Long.parseLong(str[i]);
        }

        // bubble start
        for (int j = 0; j < arrN.length; j++) {
        for (int i = j + 1; i < arrN.length; i++) {
            if (arrN[j] < arrN[i]) {
                long temp = arrN[j];
                arrN[j] = arrN[i];
                arrN[i] = temp;
            }
        }
        }
        System.out.println(Arrays.toString(arrN));

        for (long answerFinal : arrN) {
            answer += answerFinal;
        }
            System.out.print(answer);

         */

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(new DesecndingOrder().solution(1238556));
    }
}
