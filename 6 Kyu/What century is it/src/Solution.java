public class Solution{
    public static String whatCentury(int year) {
        StringBuilder sb = new StringBuilder();

        if (year <= 100){
            sb.append("1st");
        }else if (year % 100 == 0) {
            sb.append(year/100);
        }else {
            sb.append(year/100+1);
        }

        if(Integer.parseInt(sb.toString()) >= 4 && Integer.parseInt(sb.toString()) < 21){
            sb.append("th");
        }else {
            switch (sb.toString().charAt(sb.length() - 1)) {
                case '1' -> sb.append("st");
                case '2' -> sb.append("nd");
                case '3' -> sb.append("rd");
                default -> sb.append("th");
            }
        }

        return sb.toString();
    }
}