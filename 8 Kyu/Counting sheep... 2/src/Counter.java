import java.util.*;

public class Counter {

    public int countSheeps(Boolean[] arrayOfSheeps) {

        if (arrayOfSheeps == null) {
            return 0;
        }

        return (int) Arrays.stream(arrayOfSheeps)
                .filter(bool -> Objects.requireNonNullElse(bool, false))
                .count();
    }
}