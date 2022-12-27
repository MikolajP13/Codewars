import java.util.*;

public class JomoPipi {
    public static String numericals(String s) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(s.split("")).forEach(str -> {
            if (!map.containsKey(str)) {
                map.put(str, 1);
                sb.append(1);
            } else {
                int value = map.get(str) + 1;
                map.put(str, value);
                sb.append(value);
            }
        });

        return sb.toString();
    }
}