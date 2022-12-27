import java.util.*;
import java.util.stream.Collectors;

public class Kata {
    public static String encryptThis(String text) {

        return text.length() != 0 ? Arrays.stream(text.split("\\s"))
                .map(s -> {
                    if(s.length() > 3) {
                        return (int) s.charAt(0) + s.substring(1)
                                .replaceAll("(.)(.+)(.)", "$3$2$1");
                    }
                    return (int) s.charAt(0) + s.substring(1)
                            .replaceAll("(.)(.)", "$2$1");})
                .collect(Collectors.joining(" ")) : "";
    }
}