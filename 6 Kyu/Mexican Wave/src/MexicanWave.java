import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        List<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char[] charArray = str.toCharArray();

            if(charArray[i] == ' ') {
                continue;
            }

            charArray[i] = Character.toUpperCase(charArray[i]);
            wave.add(new String(charArray));
        }
        return wave.toArray(new String[0]);
    }

}