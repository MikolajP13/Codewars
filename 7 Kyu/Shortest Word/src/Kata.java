import java.util.*;

public class Kata {
    public static int findShort(String s) {

        return Arrays.stream(s.split(" ")).sorted((s1, s2) -> s1.length() - s2.length()).toList().get(0).length();
    }
}