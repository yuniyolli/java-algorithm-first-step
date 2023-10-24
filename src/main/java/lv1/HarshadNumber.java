package lv1;
/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

x는 1 이상, 10000 이하인 정수입니다.

 */
public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;
        // int 를 자리값에 따라 나누기 위해 String으로 바꾸기
        String strX = Integer.toString(x);
        // 자리수의 합을 더할 변수 0 으로 초기화
        int sumOfDigit = 0;

        // 반복문 : char를 통해 각 자리값을 반복하여 sumOfDigit에 저장하도록 함
        for (int i = 0; i < strX.length(); i++) {
            sumOfDigit += Integer.parseInt(String.valueOf(strX.charAt(i)));
        }

        System.out.println(sumOfDigit);

        if (x % sumOfDigit == 0) {
            answer = true;
        } else answer = false;

        System.out.println(answer);

        //return answer;

        // boolean 활용하기
        return x % sumOfDigit == 0;
    }

    public static void main(String[] args) {
        new HarshadNumber().solution(11);
    }
}
