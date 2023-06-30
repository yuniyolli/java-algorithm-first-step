package lv0.condition;

public class CalculateWSDA {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }

            answer = n;
            //System.out.print(answer + "," + n + " -> ");
        }
        return answer;
    }

    public static void main(String[] args) {
        CalculateWSDA wsda = new CalculateWSDA();
        System.out.println(wsda.solution(0, "wsdawsdassw"));
    }
}
