import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a == null || b == null ||
                (a.length == 0 && b.length != 0) || (b.length == 0 && a.length != 0)){
            return false;
        } else if (a.length == 0 || b.length == 0) {
            return true;
        }

        List<Integer> listOfA = Arrays.stream(a).map(i -> i*i).boxed().toList();
        List<Integer> listOfB = Arrays.stream(b).boxed().collect(Collectors.toList());

        for (Integer i : listOfA) {
            if(listOfB.contains(i)) {
                listOfB.remove(i);
            }else{
                return false;
            }
        }

        return true;
    }
}