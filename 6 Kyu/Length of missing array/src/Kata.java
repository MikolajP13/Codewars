import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata{

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

        int n = 0;
        boolean isNullOrEmpty = false;

        if(arrayOfArrays == null || arrayOfArrays.length == 0){
            isNullOrEmpty = true;
        }else {
            for (Object[] o : arrayOfArrays) {
                if (o == null) {
                    isNullOrEmpty = true;
                    break;
                }
            }
        }

        if(isNullOrEmpty)
            return 0;

        int[] lengths = Arrays.stream(arrayOfArrays)
                .flatMapToInt(x -> IntStream.of(Arrays.stream(x).toArray().length))
                .sorted()
                .toArray();

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] == 0){
                return 0;
            }
        }

        int missing = lengths[0];

        while(lengths[n] == missing){
            missing++;
            n++;
        }

        return missing;
    }
}