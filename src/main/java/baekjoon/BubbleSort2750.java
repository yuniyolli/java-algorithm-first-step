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
        /*
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

         */

        // 버블정렬 최적화하기 (정렬이 끝난 부분의 값을 재정렬하지 않도록)
        // 버블정렬 수정 : 버블정렬은 인접한 두 값을 비교하는 것!!!!!!!!!!!!!!!!!!
        // 따라서 i와의 비교가 아닌 j, j+1만 비교하도록 함!!!!!!!!!!
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(nums[i]);
        }

        //System.out.println(Arrays.toString(nums));

        // 조건에 맞게 출력하기
        for(int answer : nums) {
            System.out.println(answer);
        }


    }
}
