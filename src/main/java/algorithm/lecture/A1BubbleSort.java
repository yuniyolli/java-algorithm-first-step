package algorithm.lecture;

import java.util.Arrays;

public class A1BubbleSort {
    public static void main(String[] args) {
        int[] arr = {36, 12, 18, 15, 41, 19};
        int n = arr.length;

        for (int i = 0; i < n - 1 ; i++) { // 12, 18, 15, 36, 19, 41
            // 한바퀴 순회 -> 가장 큰 수가 가장 오른쪽에 위치
            // 이유: 좌에서 각 2개씩, 큰 수를 계속 움직이고 있음
            for (int j = 0; j < n - 1 - i; j++) { // 12, 15, 18, 19, 36, 41
                // i번 순회를 했다면, i번째에는 이미 가장 큰 수가 위치해있음
                // 굳이 마지막 i번째를 순회히지 않아도 됨.
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
