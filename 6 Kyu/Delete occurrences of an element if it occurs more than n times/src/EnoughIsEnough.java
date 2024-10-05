import java.util.*;
import java.util.stream.IntStream;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> numberOccurrence = new HashMap<>();
        IntStream.range(0, elements.length).forEach(i -> numberOccurrence.put(elements[i], 0));
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            if (numberOccurrence.get(elements[i]) + 1 <= maxOccurrences) {
                resultList.add(elements[i]);
                numberOccurrence.put(elements[i], numberOccurrence.get(elements[i])+1);
            }
        }

        return resultList.stream().mapToInt(i->i).toArray();
    }

}