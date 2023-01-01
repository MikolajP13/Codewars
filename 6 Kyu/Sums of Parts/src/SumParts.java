import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SumParts {

    public static int[] sumParts(int[] ls) {
        List<Integer> result = new ArrayList<>();

        result.add(Arrays.stream(ls).sum());

        for (int i = 0; i < ls.length; i++) {
            result.add(result.get(i)-ls[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}