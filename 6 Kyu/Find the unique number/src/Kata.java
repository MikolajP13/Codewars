// Make sure your class is public
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
    public static double findUniq(double arr[]) {
        int occ1 = 0, occ2 = 0;

        Double[] arrayOfDoubles = Arrays.stream(arr).boxed().collect(Collectors.toSet()).toArray(Double[]::new);

        for (double d : arr) {
            if(d == arrayOfDoubles[0]){
                occ1++;
            }else if(d == arrayOfDoubles[1]){
                occ2++;
            }

            if(occ1 >= 2 || occ2 >= 2){
                break;
            }
        }

        return occ1 >= 2 ? arrayOfDoubles[1] : arrayOfDoubles[0];
    }
}