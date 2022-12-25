import java.util.*;

public class Kata {
    public static String shortcut(String input) {

        return String.join("", Arrays.stream(input.split(""))
                .filter(w -> !w.equals("a") && !w.equals("e") && !w.equals("i")
                        && !w.equals("o") && !w.equals("u"))
                .toList());
    }
}