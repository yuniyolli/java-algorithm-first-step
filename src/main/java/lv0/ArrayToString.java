package lv0;

public class ArrayToString {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
            //answer += Arrays.toString(arr[]);
            }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        ArrayToString listToString = new ArrayToString();
        String[] arr ={"a", "b", "c"};
        listToString.solution(arr);
    }

}
