import java.util.*;

public class DRoot {
    public static int digital_root(int n) {

        int sum = 0, result = 0;
        int[] digits = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        while(digits.length >  1){

            for (int digit : digits) {
                sum+=digit;
            }

            digits = Arrays.stream(String.valueOf(sum).split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            result = sum;
            sum = 0;
        }

        return result;
    }
}