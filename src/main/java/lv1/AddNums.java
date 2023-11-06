package lv1;

public class AddNums {
    public int solution(int[] numbers) {
        int answer = -1;
        int sumOfZeroToNine = 45;
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        return sumOfZeroToNine - sum;
    }

    /*
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
     */
}
