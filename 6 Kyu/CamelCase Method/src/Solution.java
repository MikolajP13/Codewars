import java.util.*;

public class Solution {
    public static String camelCase(String str) {

        if(str.split("\\s+").length == 0) return "";

        return str.length() == 0 ? "" : String.join("", Arrays.stream(str.trim().split("\\s+"))
                .map(w -> String.valueOf(w.charAt(0)).toUpperCase() + w.substring(1))
                .toList());
    }

}