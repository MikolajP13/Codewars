import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        final int[] i = {0};

        return lines.stream()
                .map(line -> {
                    i[0]++;
                    return i[0] + ": " + line;})
                .toList();
    }
}