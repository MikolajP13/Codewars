import java.util.Arrays;
import java.util.List;

public class ConsonantValue {
    public static int solve(final String s) {
        int max = 0;

        List<String> substrings = Arrays.stream(s.split("a|e|i|o|u"))
                .filter(substr -> substr.length() > 0)
                .toList();

        for (String substring : substrings) {
            int substrValue = 0;
            for (int i = 0; i < substring.length(); i++) {
                substrValue += substring.charAt(i) - 96;
            }
            if(substrValue > max)
                max = substrValue;
        }
        return max;
    }
}