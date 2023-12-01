package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] minutes = new int[total];
        for (int i = 0; i < total; i++) {
            minutes[i] = sc.nextInt();
        }
        Arrays.sort(minutes);

        System.out.println(new Boj11399().solution(total, minutes, 0, 0));
    }

    int solution(int end, int[] arr, int count, int sum) {
        if (count == end + 1) {
            return sum;
        }
        for (int i = 0; i < count; ++i) {
            sum += arr[i];
        }
        return solution(end, arr, count + 1, sum);
    }
    }