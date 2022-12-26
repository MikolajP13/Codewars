import java.util.*;

public class CountDig {
    public static int nbDig(int n, int d) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            if(String.valueOf(i*i).contains(String.valueOf(d))){
                sb.append(i*i);
            }
        }

        return (int) Arrays.stream(sb.toString().split("")).filter(numInStr -> numInStr.equals(String.valueOf(d))).count();
    }
}