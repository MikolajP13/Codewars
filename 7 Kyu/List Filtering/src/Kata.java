import java.util.List;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o instanceof Integer ).toList();
    }
}