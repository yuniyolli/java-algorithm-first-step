package lv0.string;

public class RnyStringForEach {
    public String solution(String rny_string) {
        String answer = "" ;

        rny_string.split("");

        for(String rnys: rny_string.split("")) {
            if (rnys.equals("m")) {
                 rnys = "rn";
             }
           answer += rny_string.replaceAll(rny_string, rnys);
         }
        System.out.println(answer);

        return answer;

    }

    public static void main(String[] args) {
        new RnyStringForEach().solution("master");
    }
}
