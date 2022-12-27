import java.util.stream.IntStream;

public class Kata {
    public static int findEvenIndex(int[] arr) {

        return IntStream.range(0, arr.length)
                .filter(num -> IntStream.of(arr).limit(num).sum() == IntStream.of(arr).skip(num+1).sum())
                .findFirst()
                .orElse(-1);
    }
}