import java.util.*;

public class Kata {
    public static int[] DataReverse(int[] data) {
        String numSeq = String.join("", Arrays.stream(data).mapToObj(String::valueOf).toList());
        List<String> numList = new ArrayList<>(Arrays.asList(numSeq.split("(?<=\\G.{8})")));
        Collections.reverse(numList);

        return Arrays.stream(String.join("", numList).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}