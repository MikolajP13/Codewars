import java.util.*;
public class MySolution {

    public int computeDepth(int n) {
        Map<String, Integer> digitsAndOcc = new HashMap<>();
        digitsAndOcc.put("0", 0); digitsAndOcc.put("1", 0); digitsAndOcc.put("2", 0);
        digitsAndOcc.put("3", 0); digitsAndOcc.put("4", 0); digitsAndOcc.put("5", 0);
        digitsAndOcc.put("6", 0); digitsAndOcc.put("7", 0); digitsAndOcc.put("8", 0);
        digitsAndOcc.put("9", 0);

        int i = 1;
        boolean countDepth = true;

        while (countDepth){

            int value = n*i;
            String[] digitsArr = Integer.toString(value).split("");

            for (String digit:digitsArr) {
                digitsAndOcc.put(digit, digitsAndOcc.get(digit)+1);
            }

            for (Integer occs: digitsAndOcc.values()) {
                if (occs < 1){
                    countDepth = true;
                    break;
                }
                countDepth = false;
            }

            i++;
        }

        return i-1;
    }

}