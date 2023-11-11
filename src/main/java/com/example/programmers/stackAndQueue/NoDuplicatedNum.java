package com.example.programmers.stackAndQueue;

public class NoDuplicatedNum {
    // other solutions
    // 1. change int[] arr -> List, and add noDuplicatedNum
    // 2. set answer[list.size()]
    // 3. add each element of list into answer (list.get(i);)

    public int[] solution(int[] arr) {


        int arrLen = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (! ( arr[i] == arr[i + 1] )) {
            arrLen++;
            }
            }
        //System.out.println(arrLen);



        // new array for the arr without any duplicated number
        int[] answer = new int[arrLen + 1];

        // to count the array of answer
        int cnt = 1;
        // answer[0] is set up in advance
        answer[0] = arr[0];
        // add arr[i] to answer, if (!arr[i].equals(arr[i-1])
        for (int i = 0; i < arr.length - 1; i++) {
            if (! ( arr[i] == arr[i + 1] )) {
                answer[cnt] += arr[i + 1];
                cnt++;
            }
        }
        //System.out.println(Arrays.toString(answer));


       // System.out.println("Hello Java");
        return answer;
    }

    public static void main(String[] args) {
        new NoDuplicatedNum().solution(new int[] {1, 1, 3, 3, 0, 1, 1});
    }
}
