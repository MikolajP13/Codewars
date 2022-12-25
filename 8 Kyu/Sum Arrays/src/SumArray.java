import java.util.*;

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}