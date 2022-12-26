import java.util.*;

public class Solution {
    public static String vaporcode(String s) {
        return String.join("  ",
                Arrays.stream(s.replaceAll("\\s", "").split(""))
                        .map(String::toUpperCase)
                        .toList());
    }
}