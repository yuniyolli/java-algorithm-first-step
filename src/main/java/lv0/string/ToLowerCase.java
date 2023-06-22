package lv0.string;

public class ToLowerCase {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.solution("aBcDe"));
    }
}
