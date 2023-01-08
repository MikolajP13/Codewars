public class Kata {
    public static String removeParentheses(final String str) {
        String result = str;

        while(result.matches(".*?\\(.*?\\).*?")){
            result = result.replaceAll("\\([^()]*\\)", "");
        }
        return result;
    }
}