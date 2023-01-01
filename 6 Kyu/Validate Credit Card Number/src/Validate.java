import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validate{
    public static boolean validate(String n){

        List<Integer> numbers  = Arrays.stream(n.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        for (int i = numbers.size()-2; i >= 0; i-=2) {
            int num = numbers.get(i)*2;
            if(num > 9){
                numbers.set(i, num-9);
            }else {
                numbers.set(i, numbers.get(i) * 2);
            }
        }

        return numbers.stream().mapToInt(i -> i).sum()%10 == 0;
    }
}