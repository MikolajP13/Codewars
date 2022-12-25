public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        int r = repeat;

        while (r > 0){
            sb.append(string);
            r--;
        }

        return sb.toString();
    }
}