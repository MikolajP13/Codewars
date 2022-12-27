import java.util.*;
public class DuplicateEncoder {
    static String encode(String word){
        Map<Character, Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char c:word.toLowerCase().toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for (char c:word.toLowerCase().toCharArray()) {
            int f = freq.get(c);
            if(f == 1){
                sb.append('(');
            }else{
                sb.append(')');
            }
        }

        return sb.toString();
    }
}