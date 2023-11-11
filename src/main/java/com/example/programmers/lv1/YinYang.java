package com.example.programmers.lv1;

public class YinYang {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0 ; i < absolutes.length ; i++ ) {
                //absolutes[i] = signs[i] == true ? absolutes[i] : -absolutes[i] ;
                // signs 가 이미 boolean, true라고 표시안해도 됨
                absolutes[i] = signs[i] ? absolutes[i] : -absolutes[i];
                answer += absolutes[i];

                /*
                // answer까지 한번에 처리하기
                answer += absolutes[i] * (signs[i] ? 1 : -1);

                 */
            }
            return answer;
        }
}
