import java.util.*;
public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (String letter:lstOf1stLetter) {
            stringIntegerMap.put(letter, 0);
        }

        for (String firstLetter:lstOf1stLetter) {
            for (String s : lstOfArt) {
                String[] art = s.split("\\s");
                if (firstLetter.equals(art[0].substring(0, 1))) {
                    stringIntegerMap.put(firstLetter, stringIntegerMap.get(firstLetter) + Integer.parseInt(art[1]));
                }
            }
        }

        boolean isEmpty = true;
        for (int value : stringIntegerMap.values()) {
            if(value != 0){
                isEmpty = false;
                break;
            }
        }

        if(isEmpty){
            return "";
        }

        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            String s = String.format("(%s : %d) ", entry.getKey(), entry.getValue());
            sb.append(s);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return sb.toString().trim().replaceAll("\\)\\s\\(", ") - (");
    }
}