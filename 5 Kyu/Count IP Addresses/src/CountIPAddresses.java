import java.util.*;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return Math.abs(countLongNumber(start) - countLongNumber(end));
    }

    private static long countLongNumber(String ipAddress) {
        return Long.parseLong(String.join("", Arrays.stream(ipAddress.split("\\."))
                .map(x -> Long.toBinaryString(Long.parseLong(x))).map(x -> {
                    StringBuilder sb = new StringBuilder();
                    if (x.length() < 8) {
                        sb.append("0".repeat(8 - x.length()));
                        return sb.append(x).toString();
                    } else {
                        return x;
                    }
                }).toList()), 2);
    }
}