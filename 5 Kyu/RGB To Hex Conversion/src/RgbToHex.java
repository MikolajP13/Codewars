import java.util.*;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        int[] rgb = new int[]{r,g,b};
        for (int i = 0; i < rgb.length; i++) {
            if(rgb[i] < 0){
                rgb[i] = 0;
            }else if (rgb[i] > 255){
                rgb[i] = 255;
            }
        }

        Map<Integer, String> codeMap = Map.ofEntries(
                Map.entry(0, "0"), Map.entry(1, "1"), Map.entry(2, "2"),
                Map.entry(3, "3"), Map.entry(4, "4"), Map.entry(5, "5"),
                Map.entry(6, "6"), Map.entry(7, "7"), Map.entry(8, "8"),
                Map.entry(9, "9"), Map.entry(10, "A"), Map.entry(11, "B"),
                Map.entry(12, "C"), Map.entry(13, "D"), Map.entry(14, "E"),
                Map.entry(15, "F")
        );

        StringBuilder sb = new StringBuilder();
        double number = 0;
        double remainder = 0;

        for (int j : rgb) {
            number = j / 16.0;
            remainder = number - Math.floor(number);
            sb.append(codeMap.get((int) number));
            sb.append(codeMap.get((int) (remainder * 16)));
        }

        return sb.toString();
    }
}