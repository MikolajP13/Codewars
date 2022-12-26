public class SecureTester{

    public static boolean alphanumeric(String s){

        if(s.matches(".*_+.*") || s.length() == 0){
            return false;
        }

        return s.matches("\\w+");
    }

}