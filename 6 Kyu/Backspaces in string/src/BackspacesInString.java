import java.util.*;

public class BackspacesInString {
    public String cleanString(String s) {

        if(s.length() == 0 || s.matches("#+")){
            return "";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#'){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        return stack.toString().replaceAll(",|\\s|\\[|]", "");
    }
}