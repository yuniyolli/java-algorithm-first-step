package com.example.programmers.lv1;

import java.util.Arrays;

public class NumK42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        /*
        -  i번째부터, j까지 잘라서 정렬 후, k번째 수
        -  for; test.length : 각각의 배열 분리하기
        -  for array.length : 배열을 순회하며 새로운 배열 만들기
        -  (j - i + 1이 전체 길이, 전체 인덱스 j - i)
        -  int[] newArr = new int[commands[i][0] - commands[i][1] + 1]
        -  bubbleSort 구현
        -  answer[i] += newArr[commands[i][2]]
         */

        // for; test.length : 각각의 배열 분리하기
        for (int i = 0; i < commands.length; i++) {
            // for array.length : 배열을 순회하며 새로운 배열 만들기
            // (j - i + 1이 전체 길이, 전체 인덱스 j - i)
            for (int j = 0; j < array.length; j++) {
                // int[] newArr = new int[commands[i][0] - commands[i][1] + 1]
                int lengthOfSortedArr = commands[i][1] - commands[i][0] + 1;
                int[] sortedArr = new int[lengthOfSortedArr];
                for (int k = 0; k < sortedArr.length; k++) {
                    sortedArr[k] = array[commands[i][0] + k - 1];
                }
                // bubbleSort 구현
                for (int k = 0; k < sortedArr.length; k++) {
                    for (int l = 1; l < sortedArr.length - k; l++) {
                        if(sortedArr[l - 1] > sortedArr[l]) {
                            int temp = sortedArr[l - 1];
                            sortedArr[l - 1] = sortedArr[l];
                            sortedArr[l] = temp;
                        }
                    }
                }

                answer[i] = sortedArr[commands[i][2] - 1];


            }
        }
       // System.out.println(Arrays.toString(answer));


        return answer;
    }
    public static void main(String[] args) {
        System.out.println("answer");
        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        new NumK42748().solution(array, commands);

        System.out.println("--------test----------");
        int[][] test = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(Arrays.toString(test));
        System.out.println(test.length);
        for (int i = 0; i < test.length; i++) {
            System.out.println(Arrays.toString(test[i]));
        }
    }
}
