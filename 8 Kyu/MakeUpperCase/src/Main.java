import java.util.*;

class Upper{
    public static String MakeUpperCase(String str){

        return String
                .join("", Arrays.stream(str.split(""))
                        .map(String::toUpperCase).toList());
    }
}