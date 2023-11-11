package com.example.programmers.lv0.string;

public class SumOfString {
    public int solution(String num_str) {
        int answer = 0;
        //num_str.split("")
        //ParseInt.
        //fori answer += charAt
        //-> charAt 은 Int로 변환이 안됨 -> subString!
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(num_str.substring(i, i + 1));
            //System.out.println(num_str.substring(i, i + 1));
        }
       // System.out.println();
        //System.out.println(answer);
        return answer;
    }
    /* 기타 방법들
    1. .split과 arr 사용하기
    이건 배열을 다루는게 어려워서 피한 방법
    String[] numArr = num_str.split("") -> 하면 자동으로 쪼개진 애들이 배열에 들어가며 초기화

    -> 이후 foreach문도 활용하는데 아직 난 잘 못함
    for (String num : numArr) {
        answer += Integer.parseInt(num)
    }
    -> 음... numArr에 담긴 값들을 하나씩 String num 으로 바꿀텐데
    하나씩 넣을 때마다 answer에 추출된 하나의 num값을 정수형으로 변환해서 더해라.


    2. answer += (int)num_str.charAt(i) - 48;
    -> 내가 쓰려했던 방법인 듯함.
    -> char이 정수랑 문자를 오가는거라 그런지 따로 파싱없이 형 변환이 됐네,, 그리고 숫자로 바꾸는거는 - 48.
    -> 난 아직 이게 너무 어려워...

    3. return numStr.chars().map(c -> c - 48).sum();
    -> 못보던 방법. 저게 스트림인가,,,? 캐릭터로 변환후에, 맵으로 캐릭터를 정수로 변환. 합한다 ?
     */

    public static void main(String[] args) {
        SumOfString string = new SumOfString();
        string.solution("12345");
    }
}
