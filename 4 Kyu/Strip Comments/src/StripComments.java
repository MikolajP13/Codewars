import java.util.*;
import java.util.stream.Collectors;
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        return Arrays.stream(text.split("\n")).map(s -> {
            for (String symb : commentSymbols) s = s.replaceAll("(\\s+$)|(\\s*[" + symb + "].*)", "");
            return s;
        }).collect(Collectors.joining("\n"));

    }

}