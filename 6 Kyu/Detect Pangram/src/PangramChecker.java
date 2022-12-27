import java.util.*;
import java.util.stream.Collectors;

public class PangramChecker {
    public boolean check(String sentence){
        String sentenceWithoutPunctuationAndNumbers =
                sentence.replaceAll("\\p{Digit}|\\p{Punct}", "");

        Set<String> set = Arrays.stream(sentenceWithoutPunctuationAndNumbers
                        .replaceAll("\\s", "").split(""))
                .map(w -> w.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        return set.size() >= 26;
    }
}