package lv0;

public class ComparingCalculation {
    /*
    양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
    단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
    -Integer.toString() or String.valueOf()
    - Integer.valueOf() or Integer.parseInt()
     */
    public int solution(int a, int b) {
        int answer = 0;

        int aPlusB =  Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multipleNum = 2 * a * b;

       if (aPlusB >= multipleNum) {
           answer = aPlusB;
       } else {
           answer = multipleNum;
       }


        return answer;
    }
}
