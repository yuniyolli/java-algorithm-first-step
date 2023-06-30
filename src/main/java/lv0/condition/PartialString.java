package lv0.condition;

public class PartialString {
    // .contains ? 1 : 0 또는 .indexOf > -1 ? 1 : 0 사용가능
    public int solution(String my_string, String target) {
        int answer = 0;

        //substring(a, b) : a부터 b-1까지, 첫 문자는 0에서 시작
        //따라서 +1 해야 마지막 문자까지 확인이 가능
        for (int i = 0; i < my_string.length() - target.length() + 1  ; i++) {
            //for (int i = 0; i < my_string.length() -1 ; i++) {

            //== 주소값 비교. 따라서 .equeals()사용하여 조건 비교
            if (my_string.substring(i, i + target.length()).equals(target)) {
                // if (my_string.substring(i, i + target.length()) == target) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }

        }
        // System.out.println(target.length());  -> length: 첫 문자를 1부터 셈. ana = 3
        //System.out.println(my_string.substring(1, 3)); -> HELLOWORLD -> EL
        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        PartialString partialString = new PartialString();
        System.out.println(partialString.solution("helloworld", "low"));
    }
}
