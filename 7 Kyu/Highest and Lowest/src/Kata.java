import java.util.*;

public class Kata {
    public static String highAndLow(String numbers) {
        StringBuilder result = new StringBuilder();

        result.append(Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().orElse(0));
        result.append(" ");
        result.append(Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().orElse(0));

        return result.toString();
    }
}