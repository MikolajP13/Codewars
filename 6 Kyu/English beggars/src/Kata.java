import java.util.*;

public class Kata{
    public static int[] beggars(int[] values, int n) {
        int[] result = new int[n];
        int beggarId = 0;

        if(n == 0){
            return result;
        }else if(n == 1){
            return new int[]{Arrays.stream(values).sum()};
        }

        for (int i = 0; i < values.length; i++) {
            result[beggarId] += values[i];

            beggarId++;
            if(beggarId == n){
                beggarId = 0;
            }
        }

        return result;
    }
}