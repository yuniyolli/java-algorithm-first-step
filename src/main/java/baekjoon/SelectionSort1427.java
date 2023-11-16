package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 실행 전 내가 쓴 답안과 예시답안 중 하나는 주석처리할 것 (Scanner반복실행)

        int num = sc.nextInt();
        String[] strs = String.valueOf(num).split("");
        int[] nums = new int[strs.length];
        int maxIdx = 0;

        // 정수 배열로 변경
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    maxIdx = j;
                int temp = nums[i];
                nums[i] = nums[maxIdx];
                nums[maxIdx] = temp;
                }

            }
        }
        //System.out.println(Arrays.toString(nums));
        for (int answer : nums) {
            System.out.print(answer);
        }

        // 예시답안: String으로 받아서 형변환
        String str = sc.next();
        int A[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        // 선택정렬
        for (int i = 0; i < A.length; i++) {
            int max = i;
            for (int j = i  + 1; j < A.length ; j++) {
                if(A[j] > A[max]) {
                    max = j;
                }
            }
            // 이게 모범답안이긴한데 이미 j랑 max(i) 값을 비교했는데 또 조건문을 할 필요가 있나?
            if(A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }




    }
}
