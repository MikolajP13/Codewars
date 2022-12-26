import java.math.BigInteger;
public class Kata {
    public static String incrementString(String str) {
        StringBuilder sb = new StringBuilder();

        String letters = str.replaceAll("[0-9]+$", "");
        String number = str.substring(letters.length());
        int lenDiff = str.length()-letters.length();

        sb.append(letters);

        if(number.length() == 0){
            number = "0";
            number = String.valueOf((Integer.parseInt(number)+1));
        }
        else{
            BigInteger bi = new BigInteger(number);
            number = bi.add(new BigInteger("1")).toString();
        }

        int i = number.length();

        while (i < lenDiff) {
            sb.append("0");
            i++;
        }

        sb.append(number);

        return sb.toString();
    }
}