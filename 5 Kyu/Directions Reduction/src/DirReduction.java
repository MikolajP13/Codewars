import java.util.*;
import java.util.stream.Collectors;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> destination = Arrays.stream(arr).collect(Collectors.toList());
        String[] directions = new String[]{"NORTH", "SOUTH", "EAST", "WEST"};
        int i = 0;

        while (i < destination.size()){

            if(i+1 > destination.size()-1){
                break;
            }

            if (destination.get(i).equals(directions[0]) && destination.get(i+1).equals(directions[1])
                    || destination.get(i).equals(directions[1]) && destination.get(i+1).equals(directions[0])){
                destination.remove(i);
                destination.remove(i);
                i = 0;
            }else if(destination.get(i).equals(directions[2]) && destination.get(i+1).equals(directions[3])
                    || destination.get(i).equals(directions[3]) && destination.get(i+1).equals(directions[2])){

                destination.remove(i);
                destination.remove(i);
                i = 0;
            }else{
                i++;
            }

        }

        return destination.toArray(new String[0]);
    }
}