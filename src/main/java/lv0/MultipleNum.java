package lv0;

public class MultipleNum {
    public int solution(int num, int n) {
        int answer =  (num % n == 0) ? 1 : 0 ;
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum();
        multipleNum.solution(23,4);
    }
}
