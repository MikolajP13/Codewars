import java.util.stream.Collectors;
import java.util.*;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        return Arrays.stream(name.split(" "))
                .map(s -> s.substring(0, 1))
                .map(String::toUpperCase)
                .collect(Collectors.joining("."));
    }
}