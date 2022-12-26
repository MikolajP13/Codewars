import java.util.Arrays;
public class Max {
    public static int sequence(int[] arr) {
        boolean hasOnlyNegatives = Arrays.stream(arr).allMatch(i -> i < 0);

        if(arr.length == 0 || hasOnlyNegatives){
            return 0;
        }

        int maxSubArr = arr[0];
        int maxSubArrCurr = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            maxSubArrCurr = Math.max(arr[i], maxSubArrCurr+arr[i]);
            maxSubArr = Math.max(maxSubArr, maxSubArrCurr);
        }
        return maxSubArr;

    }
}