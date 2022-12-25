import java.util.*;
public class Kata{
    public static double find_average(int[] array){

        return Arrays.stream(array).reduce(Integer::sum).stream().sum() / (double) Arrays.stream(array).count();
    }
}