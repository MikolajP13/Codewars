import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DigPow {

    public static long digPow(int n, int p) {
        AtomicInteger counter = new AtomicInteger(p-1);
        List<Integer> list = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt).toList();

        int sum = list.stream()
                .map(num -> Math.pow(num, counter.incrementAndGet()))
                .reduce(0.0, Double::sum)
                .intValue();

        return sum%n == 0 ? sum/n : -1;
    }

}