import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int[][] twosDifference(int[] array) {
        List<List<Integer>> twoDiff = new ArrayList<>();

        array = Arrays.stream(array).sorted().toArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) == 2){
                    twoDiff.add(List.of(array[i], array[j]));
                }
            }
        }

        return  twoDiff.stream()
                .map(i -> i.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }
}