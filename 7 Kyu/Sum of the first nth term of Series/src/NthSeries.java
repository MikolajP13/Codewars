import java.util.stream.IntStream;

public class NthSeries {

    public static String seriesSum(int n) {
        final double[] divider = {1.0};
        final String DEFAULT_RETURN = "0.00";

        return n == 0 ? DEFAULT_RETURN : String.format("%.2f",
                IntStream.range(0, n).mapToDouble(num -> {
                    if (num == 0) {
                        return 1;
                    } else {
                        divider[0] = divider[0] + 3.0;
                        return 1 / divider[0];
                    }
                }).sum());
    }
}