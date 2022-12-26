import java.util.*;

public class Kata {
    public static boolean hasUniqueChars(String str) {

        Set<String> setOfChars = new HashSet<>(Arrays.asList(str.split("")));

        return setOfChars.size() == str.length();
    }
}