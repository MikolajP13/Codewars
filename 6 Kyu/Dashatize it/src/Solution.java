import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static String dashatize(int num) {
    /* ver.1
        List<String> list = Arrays.stream(String.valueOf(num).split(""))
                .map(s -> Integer.parseInt(s) % 2 != 0 ? "-" + s + "-" : s)
                .collect(Collectors.toList());

        return String.join("", list)
                .replaceAll("-+", "-")
                .replaceAll("^-|-$", "");
    */
        // ver.2
        return String.valueOf(num)
                .replaceAll("(1|3|5|7|9)", "-$0-")
                .replaceAll("-+", "-")
                .replaceAll("^-|-$", "");
    }
}