package algorithm.lecture;

import java.util.Arrays;
// the smallest the first
// find the smallest number and put it in front of the array.

// cf) Bubble sort. Compare each index.
public class A2SelectionSort {
    public static void main(String[] args) {
        // declare an Array
        int[] arr = {25, 12, 18, 24, 2, 21};

        // length of the Array
        int arrLen = arr.length;

        // repeat to circulate the whole array
        // BE AWARE : don't need to circulate the last number. if so, outBound,..
        // 'i' will be compared with following 'j'
        for (int i = 0; i < arrLen - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < arrLen ; j++) {
                // compare a value with minIndex
                if (arr[j] < arr[minIndex]) {
                    // this is wrong. you need to change minIndex, not a value of certain index
                    // arr[j] = minIndex;
                    minIndex = j;
                }
            }
            int newMinIndexTemp = arr[minIndex];
            // This is wrong. you need to keep the value of new minIndex
            // Then, switch (to switch put the original arr[0](==25) into arr[5] which refers to arr[minIndex]
            // Finally, put newly minIndexNum on the first place
            //arr[i] = afterACirculationTemp;
            arr[minIndex] = arr[i];
            arr[i] = newMinIndexTemp;
        }
        // switch new minIndex with minIndex
        System.out.println(Arrays.toString(arr));
        System.out.println("you have " + 10 + "  minutes left");
    }
}
