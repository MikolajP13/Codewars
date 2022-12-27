import java.util.*;
import java.util.stream.IntStream;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        final int[] goodRacesWorth = new int[]{1,2,3,3,4,10};
        final int[] evilRacesWorth = new int[]{1,2,2,2,3,5,10};

        int[] army1 = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] army2 = Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();

        int army1score = IntStream.range(0, army1.length).map(i -> army1[i] * goodRacesWorth[i]).sum();
        int army2score = IntStream.range(0, army2.length).map(i -> army2[i] * evilRacesWorth[i]).sum();

        if(army1score > army2score){
            return "Battle Result: Good triumphs over Evil";
        }else if (army2score > army1score){
            return "Battle Result: Evil eradicates all trace of Good";
        }else{
            return "Battle Result: No victor on this battle field";
        }
    }
}