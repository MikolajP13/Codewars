import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b) {

        if (a == b) {
            return a;
        } else if (a > b) {
            return IntStream.range(b, a + 1).sum();
        } else {
            return IntStream.range(a, b + 1).sum();
        }
    }
}