import java.util.Arrays;

public class FindOutlier{
    static int find(int[] integers) {

        boolean isOutlierOdd = Arrays.stream(integers)
                .limit(3)
                .filter(i -> i%2==0)
                .count() >= 2;

        return isOutlierOdd ?
                Arrays.stream(integers).filter(i -> i%2!=0).findFirst().orElse(0) :
                Arrays.stream(integers).filter(i -> i%2==0).findFirst().orElse(0);
    }
}