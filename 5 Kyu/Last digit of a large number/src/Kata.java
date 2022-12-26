import java.math.BigInteger;

public class Kata {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        int mod = Integer.parseInt(String.valueOf(n2.mod(new BigInteger("4"))));
        String[] digits = String.valueOf(n1).split("");
        String lastDigit = digits[digits.length - 1];
        int res = Integer.parseInt(lastDigit);

        if(String.valueOf(n2).equals("0") || res == 1){
            return 1;
        }else if(String.valueOf(n2).equals("1") || res == 0){
            return res;
        }else if(mod == 0){
            switch (res){
                case 2,4,6,8 -> {return 6;}
                case 3,7,9 -> {return 1;}
                case 5 -> {return 5;}
            }
        }

        double dRes = Math.pow(res, mod);

        res = (int) dRes;


        if (res > 9) {
            String[] digitsOfRes = String.valueOf(res).split("");
            return Integer.parseInt(digitsOfRes[digitsOfRes.length-1]);
        } else {
            return res;
        }
    }
}