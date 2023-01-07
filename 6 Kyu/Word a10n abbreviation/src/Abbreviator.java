import java.util.Arrays;
import java.util.List;

public class Abbreviator {

    public String abbreviate(String string) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        System.out.println(string);
        List<String> pattern = Arrays
                .stream(string.replaceAll("\\p{Alpha}+", "x").split(""))
                .toList();

        List<String> words = Arrays
                .stream(string.split("-|_|\\W+|\\d"))
                .map(w -> {
                    if(w.length() <= 3) return w;
                    int len = w.substring(1, w.length() - 1).length();
                    return String.valueOf(w.charAt(0)) + len +
                            w.charAt(len + 1);
                }).toList();

        for (String word : pattern) {
            if(word.equals("x")){
                result.append(words.get(i));
                i++;
            }else{
                result.append(word);
            }
        }

        return result.toString();
    }
}