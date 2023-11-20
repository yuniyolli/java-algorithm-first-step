package com.example.programmers.lv1;
// 다른 방법 : .sqrt 를 활용해서 제곱수 구하기
/*
   public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
 */
public class Divisor77884 {
    public int solution(int left, int right) {
        int answer = 0;
        // 각각 숫자 순회 i = left ; i >= right ; i++
        for (int i = left; i <= right; i++) {
            // 약수의 갯수 세기 int cnt;
            int cnt = 0;
            // 각 숫자 별 약수의 갯수 cnt 추가
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            // cnt가 짝수면 answer+=, 홀수면 answer-=
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }
        return answer;
    }
}
