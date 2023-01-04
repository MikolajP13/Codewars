import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Kata {
    public static int[] sortArray(int[] array) {
        AtomicInteger index = new AtomicInteger(0);
        List<Integer> integers = Arrays.stream(array)
                .boxed()
                .filter(i -> i % 2 != 0)
                .sorted().toList();

        if(integers.isEmpty()){
            return array;
        }

        return Arrays.stream(array).boxed().map(i -> {
            if (i % 2 != 0) {
                i = integers.get(index.getAndIncrement());
                return i;
            }
            return i;
        }).mapToInt(Integer::intValue).toArray();
    }
}