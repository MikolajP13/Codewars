import java.util.*;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).summaryStatistics().getAverage() < yourPoints;
    }
}
