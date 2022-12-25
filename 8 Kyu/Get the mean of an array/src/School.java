import java.util.stream.IntStream;

public class School{

    public static int getAverage(int[] marks){
        return (int) IntStream.range(0, marks.length)
                .map(i -> marks[i])
                .summaryStatistics()
                .getAverage();
    }

}