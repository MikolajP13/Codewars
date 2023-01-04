import java.util.Arrays;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int digitsNumber = String.valueOf(number).length();

        return (int) Arrays.stream(String.valueOf(number).split(""))
                .mapToDouble(Double::parseDouble)
                .map(i -> Math.pow(i, digitsNumber))
                .sum() == number;
    }

}