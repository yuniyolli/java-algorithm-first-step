package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        // 배열 생성 확인
        // System.out.println(Arrays.toString(nums));

        // 오름차순 정렬(Bubble sort)
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(nums));

        // 조건에 맞게 출력하기
        for(int answer : nums) {
            System.out.println(answer);
        }


    }
}
