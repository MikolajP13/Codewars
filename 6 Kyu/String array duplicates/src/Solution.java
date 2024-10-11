import java.util.Arrays;

class Solution{
    public static String[] dup(String[] arr){
        return Arrays.stream(arr).map(str -> str.replaceAll("(.)\\1+", "$1")).toArray(String[]::new);
    }
}