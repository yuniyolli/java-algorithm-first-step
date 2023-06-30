package lv0.array;

import java.util.Arrays;

public class OfMultipleNum {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int arrNum = 0;
        //Multiple Number of K
        //Ascending

        //i = 0 -> n,
        for (int i = 1; i <= n; i++) {
            //뭔가 배열 초기화 해야할 거 같은데.,,,
            //ㅇ ㅏ... 길이 n / k -> 배수의 최대 개수... 이런게 있네,,,

            //if (i % k == 0, answer[i] += k )
            if (i % k == 0) {
                answer[arrNum] += i;
                arrNum++;
            }

        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        OfMultipleNum ofMultipleNum = new OfMultipleNum();
        ofMultipleNum.solution(10, 3);
    }
}
