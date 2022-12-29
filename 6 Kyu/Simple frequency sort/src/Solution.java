import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static int[] sortByFrequency(int[] array) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();

        Arrays.stream(array).boxed().sorted(Comparator.naturalOrder()).forEach(i -> map.put(i, 0));
        Arrays.stream(array).boxed().forEach(i -> map.put(i, map.get(i)+1));

        Map<Integer, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o2 - o1))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


        for (Map.Entry<Integer, Integer> entry : collect.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}