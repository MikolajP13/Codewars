import java.util.*;
public class Evaluator {

    public long evaluate(String s) {

        List<String> mathOperation = new ArrayList<>(Arrays.asList(s.split("\\s")));

        int id = 0;
        int result;

        while (mathOperation.size() != 1){

            if(mathOperation.get(id).equals("+")){
                result = Integer.parseInt(mathOperation.get(id-2)) + Integer.parseInt(mathOperation.get(id-1));
                mathOperation.set(id-2, String.valueOf(result));
                mathOperation.remove(id);
                mathOperation.remove(id-1);
                id = id-2;
            }else if(mathOperation.get(id).equals("-")){
                result = Integer.parseInt(mathOperation.get(id-2)) - Integer.parseInt(mathOperation.get(id-1));
                mathOperation.set(id-2, String.valueOf(result));
                mathOperation.remove(id);
                mathOperation.remove(id-1);
                id = id-2;
            }else if(mathOperation.get(id).equals("*")){
                result = Integer.parseInt(mathOperation.get(id-2)) * Integer.parseInt(mathOperation.get(id-1));
                mathOperation.set(id-2, String.valueOf(result));
                mathOperation.remove(id);
                mathOperation.remove(id-1);
                id = id-2;
            }else if(mathOperation.get(id).equals("/")){
                result = Integer.parseInt(mathOperation.get(id-2)) / Integer.parseInt(mathOperation.get(id-1));
                mathOperation.set(id-2, String.valueOf(result));
                mathOperation.remove(id);
                mathOperation.remove(id-1);
                id = id-2;
            }
            id++;
        }

        return Long.parseLong(mathOperation.get(0));
    }
}