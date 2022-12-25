import java.util.stream.IntStream;
public class Goals {
    public static int goals(int ...goals) {
        return IntStream.of(goals).sum();
    }
}