package lv0.string;

public class SelectStringTillN {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            char fromString = my_string.charAt(i);
            answer = String.valueOf(fromString);
            System.out.print(answer);
        }
        return answer;
            /*
            return my_string.subString(0, n)
             */
    }

    public static void main(String[] args) {
        SelectStringTillN selectStringTillN = new SelectStringTillN();
        selectStringTillN.solution("ProgrammerSS123", 11);
    }
}
