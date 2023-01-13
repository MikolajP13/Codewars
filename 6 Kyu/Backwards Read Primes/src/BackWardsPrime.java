import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {

        long[] backwardsPrime = LongStream.rangeClosed(start, end)
                .filter(i -> new BigInteger(String.valueOf(i)).isProbablePrime(10))
                .filter(i ->{
                    long rev = Long.parseLong(new StringBuilder(String.valueOf(i)).reverse().toString());
                    return i != rev && new BigInteger(String.valueOf(rev)).isProbablePrime(10);
                })
                .toArray();

        return Arrays.stream(backwardsPrime).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }
}