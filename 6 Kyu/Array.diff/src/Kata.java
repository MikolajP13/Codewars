import java.util.*;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();


        if(a.length == 0){
            return new int[0];
        }

        boolean exists = false;

        for (int i_a : a) {
            for (int i_b : b) {
                if(i_a == i_b){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                result.add(i_a);
            }
            exists = false;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}