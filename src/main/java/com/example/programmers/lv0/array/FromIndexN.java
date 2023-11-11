package com.example.programmers.lv0.array;

public class FromIndexN {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        //int[] answer = new int[3];
        int count = 0;

        for (int i = 0; i < num_list.length ; i++) {

            if (i >= n - 1) {
                //int count = 0; //-> 했을때는 첫번째 자리에 계속 더해졌는데 왜그렇지? -> 매번 다시 0으로 초기화 되기 때문!!!
                answer[count] += num_list[i];
                count++;
                //System.out.println(count);
            }

        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        new FromIndexN().solution(new int[]{2, 1, 6}, 3);
        new FromIndexN().solution(new int[]{5, 2, 1, 7, 5}, 2);
    }
}
