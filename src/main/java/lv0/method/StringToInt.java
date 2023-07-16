package lv0.method;

public class StringToInt {
    public int solution(String n_str) {
        int answer = Integer.parseInt(n_str);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new StringToInt().solution("10");
    }
}
