import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
    public static String order(String words) {

        if(words.length() == 0){
            return "";
        }

        List<String> listStr = Stream
                .of(words.split(" "))
                .sorted(Comparator.comparingInt(w -> Integer.parseInt(w.replaceAll("\\D", ""))))
                .toList();

        return listStr.stream().collect(Collectors.joining(" ","",""));
    }
}