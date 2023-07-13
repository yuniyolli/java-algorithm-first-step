package lv0.array;

// else if 사용
// arr[i] = answer[i] 를 마지막에만 실행
// 저 두개를 안하고 if사용하고 매 if문마다 answer값을 설정하니까
// answer값이 바뀐상태에서 다시 answer값 계산을하면서 한시간 넘게 날림...
// 시간이 아깝네,.,,,,
/*
if if vs if if else
if - else if -> 총 조건문이 100개 있을때 첫 if문 조건에 만족하면 뒤에 99개의 else if조건은 체크하지 않습니다.

if - if -> 총 조건문이 100개 있을때 만족 여부와 관계없이 99개의 조건을 모두 체크합니다.



결론 : 특정 조건 만족하면 나머지 조건을 체크할필요가 없는경우 if-else if 사용

         조건 만족 여부에 관계없이 모두 조건 체크가 필요한경우 if - if 사용

         상황에따라 다르게 사용해야합니다.



         위에 술취한 아저씨님 말씀대로 if-else if 사용이면 성립 확률이 높은 조건일수록

         위쪽에 걸어주는게 성능상 좋습니다.
 */
/* stream 이건 이해할수없음
 return Arrays.stream(arr).map(operand -> operand >= 50 && operand % 2 == 0 ? operand / 2 : operand < 50 && operand % 2 == 1 ? operand * 2 : operand).toArray();
         }


 */
import java.util.Arrays;

public class ArrayIfElse {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length ];

        // arr 각 원소를 반복하기
        for (int i = 0; i < arr.length  ; i++) {
            // 원소의 값 >= 50 && 원소의 값 % 2 == 0 이면 원소 / 2
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
                // 배열 추가
                //answer[i] = arr[i];

            }
            else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
                // 배열 추가
                //answer[i] = arr[i];

            }
            //else {
                answer[i] = arr[i];

            //}
            // 원소의 값 < 50 && 원소의 값 % 2 != 0 이면 원소 * 2
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        ArrayIfElse arrayByCondition = new ArrayIfElse();
        arrayByCondition.solution(new int[]{1, 2, 3, 100, 99, 98});
    }
}
