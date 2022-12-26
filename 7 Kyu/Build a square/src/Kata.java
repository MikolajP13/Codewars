public class Kata {
    public static String generateShape(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("+");
            }
            if(i < n-1){
                sb.append("\n");}
        }

        return sb.toString();
    }
}