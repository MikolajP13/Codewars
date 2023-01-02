import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persist {
    public static int persistence(long n) {
        int counter = 0;
        List<String> digits;

        while(String.valueOf(n).length() > 1){
            digits = Arrays.stream(String.valueOf(n).split(""))
                    .collect(Collectors.toList());
            n = 1;
            for (String digit : digits) {
                n *= Long.parseLong(digit);
            }
            counter++;
        }

        return counter;
    }
}