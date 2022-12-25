package cw;
import java.util.*;
import java.util.stream.Collectors;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        int sum = 0;
        boolean checkAgain = false;

        List<List<Integer>> intervalsList = new ArrayList<>(Arrays.stream(intervals).map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList())).toList());

        // overlap check
        for (int i = 0; i < intervalsList.size(); i++) {

            if(checkAgain){
                i = 0;
            }

            if (intervalsList.size() == 1 || i+1 > intervalsList.size()-1){
                break;
            }

            for (int j = i; j < intervalsList.size(); j++) {
                if (j+1 > intervalsList.size()-1){
                    break;
                }

                int sumOfInterval = Math.abs(intervalsList.get(i).get(0) - intervalsList.get(i).get(1)) +
                        Math.abs(intervalsList.get(j+1).get(0) - intervalsList.get(j+1).get(1));
                int max = Math.max(intervalsList.get(i).get(1), intervalsList.get(j+1).get(1));
                int min = Math.min(intervalsList.get(i).get(0), intervalsList.get(j+1).get(0));

                if (sumOfInterval > max - min){

                    intervalsList.remove(i);
                    intervalsList.remove(j);


                    int newItem = intervalsList.size();
                    intervalsList.add(new ArrayList<>());
                    intervalsList.get(newItem).add(min);
                    intervalsList.get(newItem).add(max);

                    checkAgain = true;
                    break;

                }else {
                    checkAgain = false;
                }
            }
        }

        for (int i = 0; i < intervalsList.size(); i++) {
            sum += Math.abs(intervalsList.get(i).get(0) - intervalsList.get(i).get(1));
        }

        return sum;
    }
}