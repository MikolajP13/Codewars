import java.util.*;
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean isScramble = true;
        boolean checkOccs = false;
        Map<String, Integer> mapStr1 = new HashMap<>();
        Map<String, Integer> mapStr2 = new HashMap<>();

        for (String s : str1.split("")) {
            mapStr1.put(s, mapStr1.getOrDefault(s, 0)+1);
        }

        for (String s : str2.split("")) {
            mapStr2.put(s, mapStr2.getOrDefault(s, 0)+1);
        }

        for (String key : mapStr2.keySet()) {
            if(mapStr1.containsKey(key)){
                checkOccs = true;
            }else{
                checkOccs = false;
                break;
            }
        }

        if(!checkOccs){
            return false;
        }else {
            for (Map.Entry<String, Integer> entry2 : mapStr2.entrySet()) {
                for (Map.Entry<String, Integer> entry1 : mapStr1.entrySet()) {
                    if (Objects.equals(entry2.getKey(), entry1.getKey())) {
                        if (entry2.getValue() > entry1.getValue()) {
                            isScramble = false;
                        }
                    }
                }
            }
        }
        return isScramble;
    }
}