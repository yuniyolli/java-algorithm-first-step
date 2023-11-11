package com.example.programmers.lv1;
/*
1937년 Collatz란 사람에 의해 제기된 이 추측은,
주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
작업은 다음과 같습니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 */
public class Collatz {
    public int solution(long num) {
        // answer == 반복횟수
        int answer = 0;

        // 결과 값이 1이 될 때까지 반복한다 (while num == 1)
        // num 이 1보다 큰 동안만 반복한다
        while (num > 1) {
            // while (num != 1)

            // 입력된 수가 짝수라면 2로 나눈다. (num % 2 == 0 ? num / 2 )
            // 입력된 수가 홀수라면 3을 곱하고 1을 더한다 ( : (num * 3) + 1 )
            num = (num % 2 == 0) ? num / 2 : (num * 3) + 1 ;
            // 1회 반복 시 answer값 추가
            answer++;

            // 500 반복할 때까지 1이 되지 않으면 -1 반환

            if (answer >= 500) {
                answer = -1;
                break;
            }


        }

        System.out.println("answer : " + answer);
        System.out.println("num :" + num);





        return answer;
    }

    public static void main(String[] args) {
        new Collatz().solution(626331);
//        new Collatz().solution(16);
//        new Collatz().solution(6);
    }
}
