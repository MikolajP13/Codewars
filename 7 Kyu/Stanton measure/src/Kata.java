import java.util.*;
public class Kata {

    public static int stantonMeasure(int[] arr) {
        int stantonMeasure = -1;
        long occForOne = Arrays.stream(arr).filter(x -> x == 1).count();

        stantonMeasure = (int) Arrays.stream(arr).filter(x -> x == occForOne).count();

        return stantonMeasure;
    }

}