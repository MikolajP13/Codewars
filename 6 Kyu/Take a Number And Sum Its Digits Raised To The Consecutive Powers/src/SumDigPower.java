import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.range(a, b).filter(l -> {
            long[] array = Arrays.stream(String.valueOf(l).split("")).mapToLong(Long::parseLong).toArray();
            long result = 0;

            for (int i = 1; i <= array.length; i++) {
                result += Math.pow(array[i - 1], i);
            }

            return result == l;
        }).boxed().toList();
    }
}