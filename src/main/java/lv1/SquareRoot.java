package lv1;
/*
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);

        if (n == x * x) {
            return answer = (x + 1) * (x + 1);
        } else

        return answer = -1;
    }

    public static void main(String[] args) {
        System.out.println(new SquareRoot().solution(3));
    }
}

/*
제곱근의 성질을 활용한 풀이
3
4
5
6
7
class Solution {
  public long solution(long num) {
      double sqrt = Math.sqrt(num);
        return (long) ((sqrt % 1) == 0 ? (sqrt + 1) * (sqrt + 1) : -1);
  }

 */
