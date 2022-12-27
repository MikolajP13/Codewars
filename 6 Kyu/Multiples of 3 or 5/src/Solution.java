import java.util.*;
public class Solution {

    public int solution(int number) {
        Set<Integer> integerList = new HashSet<>();

        for (int i = 0; i < number; i++) {
            integerList.add(i);
        }

        return integerList.stream().filter(x->(x%3==0 && x%5==0) || x%3==0 || x%5==0).reduce(0, Integer::sum);
    }
}