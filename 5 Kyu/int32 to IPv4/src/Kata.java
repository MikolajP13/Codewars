import java.util.*;

public class Kata {
    public static String longToIP(long ip) {
        StringBuilder sb = new StringBuilder();
        boolean hasFourOctets = Long.toBinaryString(ip).length() == 32;
        if (ip == 0) {
            return "0.0.0.0";
        }

        if (!hasFourOctets) {
            sb.append("0".repeat(32 - Long.toBinaryString(ip).length())).append(Long.toBinaryString(ip));
        } else {
            sb.append(Long.toBinaryString(ip));
        }

        return String.join(".", Arrays.stream(sb.toString().split("(?<=\\G.{8})"))
                .map(o -> String.valueOf(Integer.parseInt(o, 2)))
                .toList());
    }
}