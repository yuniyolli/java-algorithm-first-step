package lv0.method;

import java.util.Arrays;

public class ArrComparison {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        //Arrays.compare(arr1, arr2);
        // ㅇ ㅏ... 삼항연산자는 if 안쓰고 조건 만들어내는거라고,,,,

        answer = (arr1.length == arr2.length &&
                Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum() ? 0 :
                (arr1.length != arr2.length) && (arr1.length > arr2.length) ? 1 :
                        (arr1.length == arr2.length &&
                                Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1 ));


/*
        if (arr1.length == arr2.length &&
                Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) {
            answer = 0;
        } else if
        ((arr1.length != arr2.length) && (arr1.length > arr2.length)) {
            answer = 1;
        } else if
        ((arr1.length == arr2.length &&
                        Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum())){
            answer = 1;

        }
            answer = -1;

 */

        //System.out.println(answer);
        return answer;
    }




    public static void main(String[] args) {
        new ArrComparison().solution(new int[]{49, 13}, new int[]{70, 1, 2});
    }
}
