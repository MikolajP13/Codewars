import java.util.*;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {

        return Arrays.toString(numbers)
                .replaceAll("\\[|\\]|,|\\s", "")
                .replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }
}