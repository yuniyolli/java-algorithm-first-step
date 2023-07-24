package lv0.string;

public class RnyStringReplace {
    public String solution(String rny_string) {
        String answer = rny_string.replace("m", "rn");
        String answerAll = rny_string.replaceAll("m", "rn");
        System.out.println(answer);
        System.out.println(answerAll);
        return answer;
    }

    public static void main(String[] args) {
        new RnyStringReplace().solution("master");
    }
}
