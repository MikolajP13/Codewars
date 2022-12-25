import java.util.*;

public class StringUtils {

    public static String toAlternativeString(String string) {

        return String.join("",
                Arrays.stream(string.split(""))
                        .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
                        .toList());
    }
}