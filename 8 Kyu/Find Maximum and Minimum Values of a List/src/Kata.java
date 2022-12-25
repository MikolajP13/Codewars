import java.util.*;

public class Kata {
    public int min(int[] list) {
        return Arrays.stream(list).summaryStatistics().getMin();
    }

    public int max(int[] list) {
        return Arrays.stream(list).summaryStatistics().getMax();
    }
}