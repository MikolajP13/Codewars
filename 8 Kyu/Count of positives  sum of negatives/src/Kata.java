import java.util.*;
public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0){
            return new int[]{};
        }
        int a = (int) Arrays.stream(input).filter(i -> i > 0).count();
        int b = Arrays.stream(input).filter(i -> i < 0).reduce(0, Integer::sum);

        return new int[]{a, b};
    }
}