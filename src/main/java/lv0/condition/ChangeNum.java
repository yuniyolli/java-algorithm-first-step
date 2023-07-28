package lv0.condition;

public class ChangeNum {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        } else  {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }

        /*
      switch -> boolean에 사용 불가능
      결과 값을 case에 담는 것!


        switch (answer) {
            case k % 2 == 1 :
                for (int i = 0; i < arr.length; i++) {
                    answer[i] = arr[i] * k;
                }

            case k % 2 == 0 :
                for (int i = 0; i < arr.length; i++) {
                    answer[i] = arr[i] + k;
                }

         */

        return answer;
    }

    public static void main(String[] args) {
        new ChangeNum().solution(new int[] {1, 2, 3, 100, 99, 98}, 3);
    }
}
