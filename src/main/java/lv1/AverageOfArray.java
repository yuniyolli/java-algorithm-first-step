package lv1;

import lv0.method.ArrComparison;

import java.util.Arrays;

public class AverageOfArray {
    public double solution(int[] arr) {
        double sumArr = Arrays.stream(arr).sum();
        double answer = sumArr / arr.length;

        //System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        new AverageOfArray().solution(new int[] {1, 2, 3, 4});
    }
}
