package lv0;

public class OverWriteMood {


    public String moodOfDay(String moodDefault, String dayMood) {
    String cMood = "";
    String[] mdArr = moodDefault.split(" ");
    //String moodD1 = moodDefault.substring(0,8);
    //int insertDMood = dayMood.length();
    //String moodD2 = moodDefault.substring(s + insertDMood);

        for (int i = 0; i <= 3; i++) {
            if (i == 2) {
                mdArr[2] = dayMood;
            }
            System.out.print(mdArr[i] + " ");
        }
        System.out.println();

    cMood = String.format("%s %s %s %s", mdArr[0], mdArr[1], dayMood, mdArr[3]);
    return cMood;
}
}
