import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {

        return (int) arr.stream().filter(f -> f.matches("(:|;)(-|~)?(\\)|D)")).count();
    }
}