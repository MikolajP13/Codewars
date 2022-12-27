import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        if(s.isEmpty()){
            return new String[0];
        }

        if(Arrays.stream(s.split("")).count()%2 == 1){
            sb.append("_");
            s = sb.toString();
        }

        return s.split("(?<=\\G.{2})");
    }
}