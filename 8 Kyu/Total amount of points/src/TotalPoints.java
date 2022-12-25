import java.util.*;

public class TotalPoints {

    public static int points(String[] games) {

        return Arrays.stream(String.join(" ", games).split(" ")).mapToInt(score -> {
            String[] s = score.split(":");
            if (Integer.parseInt(s[0]) > Integer.parseInt(s[1])) {
                return 3;
            } else if (Integer.parseInt(s[0]) == Integer.parseInt(s[1])) {
                return 1;
            } else {
                return 0;
            }
        }).sum();
    }
}