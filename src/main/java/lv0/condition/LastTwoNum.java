package lv0.condition;

import java.util.Arrays;

public class LastTwoNum {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length  + 1];
//        System.out.println(num_list.length);
//        System.out.println(num_list[num_list.length - 1] * 2);
        int lastNum = num_list.length - 1;
        int lastTwoNum = num_list.length - 2;
//        System.out.println(lastNum + " "+ lastTwoNum);
//        System.out.println(num_list[lastNum]);
//        System.out.println(num_list[lastTwoNum]);

        for (int i = 0; i < num_list.length; i++) {
            answer[i] += num_list[i];
        }
       // System.out.println(Arrays.toString(answer));
        answer[num_list.length] = (
                num_list[lastNum] > num_list[lastTwoNum] ?
                num_list[lastNum] - num_list[lastTwoNum] :
                        num_list[lastNum] * 2
                );
//        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        new LastTwoNum().solution(new int[] {2, 1, 6});
    }
}
