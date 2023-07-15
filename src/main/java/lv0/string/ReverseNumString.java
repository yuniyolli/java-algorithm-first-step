package lv0.string;

public class ReverseNumString {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);

        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new ReverseNumString().solution("ProgrammerS123", 11);
    }
}
