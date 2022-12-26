import java.util.*;

public class Kata {
    public static String swap(String st){

        return String.join("", Arrays.stream(st.split(""))
                .map(letter -> letter.matches("[aeiuo]") ? letter.toUpperCase() : letter)
                .toList());
    }
}