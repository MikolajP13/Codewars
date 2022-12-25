import java.util.*;
import java.util.stream.IntStream;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {

        int[] ints = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        return IntStream.range(0, ints.length-1).map(i -> ints[i]-ints[i+1]).sum();
    }
}