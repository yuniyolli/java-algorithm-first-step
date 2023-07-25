package lv0.array;

import java.util.stream.IntStream;

public class FirstFNegative {
    public int solution(int[] num_list) {
        int answer = 0;
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();

        System.out.println(startTime);
        answer = IntStream.range(0, num_list.length)
                .filter(i -> num_list[i] < 0)
                .findFirst()
                .orElse(-1);
        System.out.println(endTime);
        System.out.println(endTime - startTime);
        System.out.println();

        System.out.println(startTime);
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            } else answer = -1;
        }
        System.out.println(endTime);
        System.out.println(endTime - startTime);


//
//        for (int num: num_list) {
//            if (num < 0 ) {
//
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        new FirstFNegative().solution(new int[]{1, 2, 3, 4, 5});
    }
}
