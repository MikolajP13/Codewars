import java.util.Arrays;
import java.util.OptionalInt;

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        final boolean[] removed = {false};

        OptionalInt min = Arrays.stream(numbers).min();

        return Arrays.stream(numbers).filter(n -> {
            if(n == min.getAsInt() && !removed[0]){
                removed[0] = true;
                return false;
            }
            return true;
        }).toArray();
    }
}