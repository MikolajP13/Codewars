import java.util.*;

public class Kata {

    public static int[] Solve(String word) {

        int[] counter = new int[4];

        counter[0] = (int) Arrays.stream(word.split(""))
                .filter(s -> s.matches("[A-Z]"))
                .count();
        counter[1] = (int) Arrays.stream(word.split(""))
                .filter(s -> s.matches("[a-z]"))
                .count();
        counter[2] = (int) Arrays.stream(word.split(""))
                .filter(s -> s.matches("\\d"))
                .count();
        counter[3] = (int) Arrays.stream(word.split(""))
                .filter(s -> s.matches("\\p{Punct}"))
                .count();

        return counter;
    }
}