import java.util.Arrays;
class Kata{
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        long[] array = Arrays.stream(numbers).sorted().toArray();
        return array[0] + array[1];
    }
}