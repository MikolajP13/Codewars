import java.util.*;

public class DnaStrand {
    public static String makeComplement(String dna) {
        List<String> complement = Arrays.stream(dna.split("")).map(symbol -> {
            switch (symbol){
                case "A" -> {
                    return "T";
                }
                case "T" -> {
                    return "A";
                }
                case "G" -> {
                    return "C";
                }
                case "C" -> {
                    return "G";
                }
            }
            return null;
        }).toList();

        return String.join("", complement);
    }
}