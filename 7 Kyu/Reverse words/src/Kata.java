import java.util.*;

public class Kata
{
    public static String reverseWords(final String original) {

        if(original.matches("\\s+")){
            return original;
        }

        String[] test = original.split(" ");

        List<StringBuilder> collect = Arrays.stream(test).map(word -> new StringBuilder(word).reverse()).toList();

        return String.join(" ", collect);
    }
}