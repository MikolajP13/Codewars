import java.util.stream.IntStream;

public class Solution {

    public static boolean isAscOrder(int[] arr) {

        if(arr.length == 0 || arr.length == 1){
            return true;
        }

        return IntStream.range(0, arr.length-1).allMatch(i -> arr[i] <= arr[i+1]);
    }

}