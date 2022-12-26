import java.util.*;
public class Vowels {

    public static int getCount(String str) {
        return (int) Arrays.stream(str.split(""))
                .filter(v->v.equals("a") || v.equals("e")|| v.equals("i")|| v.equals("o")|| v.equals("u"))
                .count();
    }

}