import java.util.*;

public class JadenCase {

    public String toJadenCase(String phrase) {
        return phrase == null || phrase.length() == 0 ?
                null : String.join(" ", Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).toList());
    }

}