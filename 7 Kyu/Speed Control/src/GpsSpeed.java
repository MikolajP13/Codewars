import java.util.stream.IntStream;
import java.util.*;

public class GpsSpeed {

    public static int gps(int s, double[] x) {

        List<Double> doubles = Arrays.stream(x).boxed().toList();

        return (int) IntStream.range(0, doubles.size() - 1)
                .mapToDouble(num -> doubles.get(num + 1) - doubles.get(num))
                .map(num -> 3600 * num / s)
                .max().orElse(0.0);
    }
}