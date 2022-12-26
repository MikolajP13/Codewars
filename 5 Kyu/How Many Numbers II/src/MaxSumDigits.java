import java.util.*;
public class MaxSumDigits {

    public static long[] maxSumDig(long nmax, int maxsm) {

        List<Long> longList = new ArrayList<>();

        for (long i = 1000; i <= nmax; i++) {
            if (checkDigits(i, maxsm)){
                longList.add(i);
            }
        }

        long nums = longList.size();
        long sumOfNums = longList.stream().reduce(0L, Long::sum);
        double avg = longList.stream().mapToLong(x -> x).average().orElse(0);

        return new long[]{nums, findClosestToMean(longList, avg), sumOfNums};
    }

    public static long findClosestToMean(List<Long> longList, double mean){
        long diff = (long) Math.abs(longList.get(longList.size()-1) - mean);
        long closest = diff;

        for (Long number : longList) {
            long diff2 = (long) Math.abs(number - mean);

            if(diff2 < diff){
                diff = diff2;
                closest = number;
            }

        }
        return closest;
    }

    public static boolean checkDigits(long l, int maxSum){
        boolean isCorrect = true;
        int sum;
        String[] digits = String.valueOf(l).split("");

        for (int i = 0; i < digits.length; i++) {
            if(i+3 > digits.length-1){
                break;
            }else{
                sum = Integer.parseInt(digits[i]) + Integer.parseInt(digits[i+1])
                        + Integer.parseInt(digits[i+2]) + Integer.parseInt(digits[i+3]);
                if(sum > maxSum){
                    isCorrect = false;
                }
            }
        }
        return isCorrect;
    }
}