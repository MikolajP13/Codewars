import java.util.ArrayList;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            int counter = 0;
            sum+=s.get(i);
            for (int j = i+1; j < s.size(); j++) {
                if(s.get(i).equals(s.get(j))) {
                    sum += s.get(j);
                    counter++;
                }
                else
                    break;
            }
            i+=counter;
            resultList.add(sum);
        }

        return resultList;
    }
}