package lv0.condition;

public class FindInt {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        //loop num_list[i]
        /*
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n ? 1)

        }

         */

        int count = 0;
        while (num_list[count]!= n) {
            answer = 0;
            count++;
            if (count == num_list.length)
                break;
            //if num_list[i] == n -> 1, or 0
            if (num_list[count] == n) {
                answer = 1;
                break;
            }
        }



        return answer;
    }
}
