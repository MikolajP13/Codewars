import java.util.Arrays;
import java.util.Map;

public class Solution {
    public static int fruit(final String[][] reels, final int[] spins) {
        int score = 0;

        Map<String, Integer> scoreTablePerItem = Map.ofEntries(
                Map.entry("Wild", 100),
                Map.entry("Star", 90),
                Map.entry("Bell", 80),
                Map.entry("Shell", 70),
                Map.entry("Seven", 60),
                Map.entry("Cherry", 50),
                Map.entry("Bar", 40),
                Map.entry("King", 30),
                Map.entry("Queen", 20),
                Map.entry("Jack", 10)
        );

        String[] result = new String[3];
        result[0] = reels[0][spins[0]];
        result[1] = reels[1][spins[1]];
        result[2] = reels[2][spins[2]];

        System.out.println(Arrays.stream(result).toList());

        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            score = scoreTablePerItem.get(result[0]);
        }
        else if (result[0].equals("Wild") && result[1].equals("Wild") ||
                result[0].equals("Wild") && result[2].equals("Wild") ||
                result[1].equals("Wild") && result[2].equals("Wild")) {
            score = 10;
        }
        else if ((result[0].equals(result[1]) || result[0].equals(result[2]) || result[1].equals(result[2]))) {
            String matchedSymbol = result[0].equals(result[1]) ? result[0] : result[1].equals(result[2]) ? result[1] : result[2];
            if (result[0].equals("Wild") || result[1].equals("Wild") || result[2].equals("Wild")) {
                score = scoreTablePerItem.get(matchedSymbol) / 5;
            } else {
                score = scoreTablePerItem.get(matchedSymbol) / 10;
            }
        }

        return score;
    }
}