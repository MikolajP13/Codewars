import java.util.*;
public class DeadFish {
    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<>();

        if (!data.matches("[idso]*")){
            return null;
        }

        int value = 0;

        for (char command: data.toCharArray()) {
            switch (command){
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> result.add(value);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}