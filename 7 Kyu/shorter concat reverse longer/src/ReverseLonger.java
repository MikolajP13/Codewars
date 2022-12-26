public class ReverseLonger {

    public static String shorterReverseLonger(String a, String b) {
        StringBuilder result = new StringBuilder();

        if(a.length() == 0 && b.length() == 0){
            return "";
        }else if(a.length() == b.length() || a.length() > b.length()){
            result.append(b)
                    .append(new StringBuilder(a).reverse())
                    .append(b);
        }else if(a.length() < b.length()){
            result.append(a)
                    .append(new StringBuilder(b).reverse())
                    .append(a);
        }

        return result.toString();
    }

}