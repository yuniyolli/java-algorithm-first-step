package baekjoon;

import java.util.Scanner;

/*
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-2 이하이면 정답이다.

3
40 80 60
:: 75.0
 */
public class Boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTest = sc.nextInt();
        long max = 0;
        long sum = 0;
        int[] grade = new int[numOfTest];

        // 받은 값으로 배열 생성
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextInt();
        }

        // 최대값 구하기
        for (int i = 0; i < grade.length; i++) {
            // sum에 한번에 다 더해버리기
            sum += grade[i];
            if (grade[i] > max) max = grade[i];
        }
        // 새로운 배열을 하나 더 만들 필요는 없음. (최종 평균을 구하기만 하면 되기 때문)
        // 각각의 요소를 개별계산하는 것보다 한번에 평균만 구하기
        System.out.println(sum * 100.0 / max / numOfTest); // 75.0
        System.out.println(sum / max * 100.0 / numOfTest); // 66.66666666666667




        /*
        // 바뀐 성적
        for (int i = 0; i < grade.length; i++) {
            grade[i] = 100 * grade[i] / max;
        }
        // 새로운 평균
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        long average = sum / numOfTest;
       // System.out.println(average);

         */

    }
}
