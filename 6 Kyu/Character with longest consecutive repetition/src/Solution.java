import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static Object[] longestRepetition(String s) {
        int maxCounter = 0;
        String maxStr = "";
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        Set<String> collect = Arrays.stream(s.split("")).collect(Collectors.toSet());
        collect.forEach(x -> stringIntegerMap.put(x, 0));


        List<String> elements = Arrays.stream(s.split("")).toList();

        int counter = 1;
        for (int i = 0; i < elements.size()-1; i++) {

            if(elements.get(i).equals(elements.get(i+1))) {
                counter++;
            }

            if(!elements.get(i).equals(elements.get(i+1)) || i+1 == elements.size()-1){
                if(counter > maxCounter){
                    maxCounter = counter;
                    maxStr = elements.get(i);
                }
                counter = 1;
            }
        }

        return new Object[]{maxStr, maxCounter};
    }
}
