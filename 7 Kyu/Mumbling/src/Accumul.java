import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
    public static String accum(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> s.toLowerCase().substring(i, i+1).toUpperCase() + s.toLowerCase().substring(i, i+1).repeat(i)).collect(Collectors.joining(" "))
                .trim()
                .replace(" ", "-");
    }
}