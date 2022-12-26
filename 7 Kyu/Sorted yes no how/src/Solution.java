import java.util.*;

class Solution {

    public static String isSortedAndHow(int[] array) {
        final String ASCENDING = "yes, ascending";
        final String DESCENDING = "yes, descending";
        final String OTHERWISE = "no";

        boolean isSortedAsc = Arrays.stream(array).boxed().sorted().toList().equals(Arrays.stream(array).boxed().toList());
        boolean isSortedDesc = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).toList().equals(Arrays.stream(array).boxed().toList());

        if (isSortedAsc){
            return ASCENDING;
        }else if (isSortedDesc){
            return DESCENDING;
        }else {
            return OTHERWISE;
        }

    }

}