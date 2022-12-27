import java.util.*;

class Solution {
    public static String camelCase(String input) {

        if(input.length() == 0){
            return "";
        }else if(input.matches("[a-z]+")){
            return input;
        }

        return String.join("", Arrays.stream(input.split(""))
                .map(w -> {
                    if(w.equals(w.toUpperCase())){
                        return " " + w;
                    }
                    return w;
                })
                .toList());
    }
}