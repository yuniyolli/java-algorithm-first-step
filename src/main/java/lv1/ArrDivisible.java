package lv1;

public class ArrDivisible {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = new int[answerLen(arr, divisor)];
        int idx = 0;

        // answer[] 만들기
        for (int i = 0; i < arr.length; i++) {
            boolean isDivisible = arr[i] % divisor == 0;
           // answer[idx] = isDivisible ? (answer[idx] += arr[i]) && idx++ : continue ;  // It does not working.

            if(isDivisible) {
                answer[idx] += arr[i];
                idx++;
            }
        }

        // 길이가 0이면 -1내보내고 끝내기
        if (answer.length == 0) {
            int isNotDivisible[] = new int[1];
            isNotDivisible[0] = -1;
            return isNotDivisible;
        }

        // answer 정렬하기 _selection sort
        for (int i = 0; i < answer.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[j] < answer[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = answer[minIdx];
            answer[minIdx] = answer[i];
            answer[i] = temp;



        }
        return answer;
    }

    public int answerLen(int[] arr, int divisor) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
              len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        new ArrDivisible().solution(new int[] {5, 9, 7, 10}, 5);
    }
}
