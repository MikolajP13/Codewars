import java.util.LinkedHashMap;
import java.util.Map;

public class PrimeDecomp {
    public static String factors(int n) {
        StringBuilder result = new StringBuilder();
        Map<Integer, Integer> factorMap = new LinkedHashMap<>();
        int divisor = 2;

        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                count++;
                n /= divisor;
            }
            if (count > 0) {
                factorMap.put(divisor, count);
            }
            divisor++;
        }

        for (Map.Entry<Integer, Integer> entry : factorMap.entrySet()) {
            int p = entry.getKey();
            int exp = entry.getValue();
            if (exp == 1) {
                result.append("(").append(p).append(")");
            } else {
                result.append("(").append(p).append("**").append(exp).append(")");
            }
        }

        return result.toString();
    }

}