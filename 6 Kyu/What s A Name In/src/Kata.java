import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Kata {
    public static boolean nameInStr(String str, String name){
        AtomicInteger j = new AtomicInteger(0);

        Arrays.stream(str.replace(" ", "").split(""))
                .map(s -> s.toLowerCase().charAt(0)).filter(c -> c.equals(name.toLowerCase().charAt(j.get())))
                .forEach(c -> j.getAndIncrement());

        return name.length() == j.get();
    }
}