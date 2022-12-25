public class Solution {
    public static int century(int number) {
        StringBuilder sb = new StringBuilder();

        if (number <= 100){
            sb.append("1");
        }else if (number % 100 == 0) {
            sb.append(number/100);
        }else {
            sb.append(number/100+1);
        }

        return Integer.parseInt(sb.toString());
    }
}