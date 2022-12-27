import java.util.*;

public class Kata {

    public static String formatWords(String[] words) {
        StringBuilder sb = new StringBuilder("");

        if(words == null || words.length == 0){
            return "";
        }

        List<String> strings = Arrays.stream(words).filter(s -> !s.equals("")).toList();
        words = strings.toArray(new String[0]);

        if(words.length == 1){
            sb.append(words[0]);
        } else if(words.length == 2){
            sb.append(words[0]).append(" and ").append(words[1]);
        }else if(words.length > 2){
            sb.append(String.join(", ",
                            Arrays.stream(words, 0, words.length - 1).toList()))
                    .append(" and ")
                    .append(words[words.length-1]);
        }

        return sb.toString();
    }
}