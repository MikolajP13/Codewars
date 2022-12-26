import java.util.*;
public class XO {

    public static boolean getXO (String str) {

        boolean isContainingXOrY = str.matches("(.*(x|X).*)|(.*(y|Y).*)");
        if(!isContainingXOrY){
            return true;
        }

        long numOfO = Arrays.stream(str.split("")).filter(s -> s.equalsIgnoreCase("o")).count();
        long numOfX = Arrays.stream(str.split("")).filter(s -> s.equalsIgnoreCase("x")).count();

        return numOfO == numOfX;
    }
}