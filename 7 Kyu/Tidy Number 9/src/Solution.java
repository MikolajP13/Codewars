import java.util.*;
public class Solution
{
    public static boolean tidyNumber(int number) {
        List<Integer> intList = new ArrayList<>();
        boolean isTidyNum = true;

        while (number > 0){
            intList.add(number%10);
            number = number/10;
        }

        Collections.reverse(intList);

        for (int i = 0; i < intList.size()-1; i++) {
            if(intList.get(i) > intList.get(i+1)){
                isTidyNum = false;
                break;
            }
        }

        return isTidyNum;
    }
}