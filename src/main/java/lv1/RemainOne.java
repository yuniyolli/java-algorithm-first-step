package lv1;

import java.util.ArrayList;
import java.util.List;

// 나머지가 1이 되는 수
/*
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
 */
public class RemainOne {
    int solution(int n) {
        List<Integer> remainOne = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (n % i == 1) {
                remainOne.add(i);
            }
        }
        int answer = remainOne.get(remainOne.size() - 1) ;
        System.out.println(answer);
        return answer;

        /*
        더 간단한 풀이
        int answer = 1
        while(ture) {
        if (n % answer == 1) break;
        answer++
        }
         */
        /*
        stream활용하기 -> stream: 함수 비용이 큰 코드에서 사용하기!
        return InteStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
         */
    }

    public static void main(String[] args) {
        RemainOne remainOne = new RemainOne();
        remainOne.solution(34);
    }
}
