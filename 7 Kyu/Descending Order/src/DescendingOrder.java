import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        int[] intArray = Arrays.stream(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).mapToInt(Integer::parseInt).toArray();

        return  Integer.parseInt(IntStream.of(intArray).mapToObj(String::valueOf).collect(Collectors.joining("")));
    }
}