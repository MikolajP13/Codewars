import java.util.Arrays;

public class Printer {
    public static String printerError(String s) {
        return Arrays.stream(s.chars().toArray()).filter(c -> c > 'm').count() + "/" + s.length();
    }
}