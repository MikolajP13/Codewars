import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScrollingTextMachine {
    public String[] rotate(String text) {
        List<String> resultList = new ArrayList<>();
        String temp = text;
        for (int i = 0; i < text.length(); i++) {
            List<String> rotated = Arrays.stream(temp.split("")).collect(Collectors.toList());
            Collections.rotate(rotated, -1);
            resultList.add(String.join("", rotated));
            temp = String.join("", rotated);
        }

        return resultList.toArray(new String[0]);
    }
}