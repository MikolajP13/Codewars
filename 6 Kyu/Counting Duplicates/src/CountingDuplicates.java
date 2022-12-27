import java.util.*;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Set<String> collect = Arrays.stream(text.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        for (String s : collect) {
            stringIntegerMap.put(s, 0);
        }

        Arrays.stream(text.split("")).map(String::toLowerCase).forEach(s -> {
            if(stringIntegerMap.containsKey(s)){
                stringIntegerMap.put(s, stringIntegerMap.get(s)+1);
            }
        });

        return (int) stringIntegerMap.entrySet().stream().filter(x -> x.getValue() > 1).count();
    }
}