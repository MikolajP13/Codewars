import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public static String binaryToText(String binary) {
        if(binary.isEmpty())
            return "";

        return Arrays.stream(binary.split("(?<=\\G\\d{8})"))
                .map(c -> Integer.parseInt(c, 2))
                .map(n -> String.valueOf((char) n.intValue()))
                .collect(Collectors.joining(""));
    }
}