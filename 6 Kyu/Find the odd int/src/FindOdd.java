import java.util.*;
public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i:a) {
            if(integerMap.containsKey(i)){
                int value = integerMap.get(i);
                value++;
                integerMap.put(i, value);
            }else {
                integerMap.put(i, 1);
            }
        }

        for (int key : integerMap.keySet()) {
            int oddTest = integerMap.get(key);
            if(oddTest%2 != 0){
                odd = key;
            }
        }

        return odd;
    }
}