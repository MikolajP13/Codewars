import java.util.Arrays;

public class Codewars {
    public static String oddOrEven (int[] array) {
        return array.length == 0 ? "even" : Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}