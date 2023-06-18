package lv0;

import java.util.Arrays;

public class CountDownArr {
    /*
    정수 start와 end가 주어질 때,
    start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution(int start, int end) {
        //int[] answer = {}; -> 그대로 쓰면 초기화가 안되어서 [] 배열 출력
        int[] answer = new int[start - end + 1];
        int idx = 0;
        for (int i = start; i >= end; i--) {
            answer[idx] += i;
            idx++;

        }
        return answer;
    }

    public static void main(String[] args) {
        CountDownArr countDownArr = new CountDownArr();

        //System.out.println(countDownArr.solution(10, 3)); -> 주소값 출력
        //Arrays.toString()
        System.out.println(Arrays.toString(countDownArr.solution(10,3)));
    }
}
