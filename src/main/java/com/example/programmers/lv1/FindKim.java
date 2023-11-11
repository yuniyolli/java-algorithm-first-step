package com.example.programmers.lv1;

//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = String.format("김서방은 %d에 있다", i);
                // 효율성을 위한 break추가
                break;
            }
        }
        // for문 대체(하지만 for문이 더 빠름):
        // int x = Arrays.asList(seoul).indexOf("Kim");

        // 속도 올리는 법: StringBuilder
        // return new StringBuilder("김서방은 ").append(x).append("에 있다");


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new FindKim().solution(new String[] {"Jane", "Kim"}));

        // 실행문 예시
        /*
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod", "Kim"};
        System.out.println(kim.findKim(names));
         */
    }
}



