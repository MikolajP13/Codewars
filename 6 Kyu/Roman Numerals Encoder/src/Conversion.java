import java.util.*;
public class Conversion {

    public String solution(int n) {

        LinkedHashMap<String, Integer> mapOfSymbols = new LinkedHashMap<String, Integer>();
        mapOfSymbols.put("M", 1000);
        mapOfSymbols.put("CM", 900);
        mapOfSymbols.put("D", 500);
        mapOfSymbols.put("CD", 400);
        mapOfSymbols.put("C", 100);
        mapOfSymbols.put("XC", 90);
        mapOfSymbols.put("L", 50);
        mapOfSymbols.put("XL", 40);
        mapOfSymbols.put("X", 10);
        mapOfSymbols.put("IX", 9);
        mapOfSymbols.put("V", 5);
        mapOfSymbols.put("IV", 4);
        mapOfSymbols.put("I", 1);

        StringBuilder res = new StringBuilder();
        for(Map.Entry<String, Integer> entry : mapOfSymbols.entrySet()){
            int matches = n/entry.getValue();
            res.append(repeat(entry.getKey(), matches));
            n = n % entry.getValue();
        }
        return res.toString();
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}