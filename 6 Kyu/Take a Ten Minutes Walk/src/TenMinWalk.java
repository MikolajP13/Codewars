import java.util.List;
import java.util.stream.IntStream;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        List<Character> characters = IntStream.range(0, walk.length).mapToObj(i -> walk[i]).toList();

        if (walk.length != 10) {
            return false;
        }

        long south = characters.stream().filter(c -> c.equals('s')).count();
        long north = characters.stream().filter(c -> c.equals('n')).count();
        long east = characters.stream().filter(c -> c.equals('e')).count();
        long west = characters.stream().filter(c -> c.equals('w')).count();

        return south == north && east == west;
    }
}