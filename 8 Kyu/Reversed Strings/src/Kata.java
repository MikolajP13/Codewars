import java.util.*;
public class Kata {

    public static String solution(String str) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(strList);

        return String.join("", strList);
    }

}