import java.util.*;

public class Dinglemouse {

    public static int kookaCounter(final String laughing) {

        return laughing.length() == 0 ? 0 : (int) (
                Arrays.stream(laughing.replaceAll("(ha)+", "f").split(""))
                        .filter(s -> s.matches("f")).count()
                        +
                        Arrays.stream(laughing.replaceAll("(Ha)+", "m").split(""))
                                .filter(s -> s.matches("m")).count()
        );
    }

}