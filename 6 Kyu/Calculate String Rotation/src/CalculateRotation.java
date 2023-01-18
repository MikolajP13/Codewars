import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateRotation {
    static int shiftedDiff(String first, String second){
        boolean isRotated = false;
        int rotationCounter = 0;

        if(first.equals(second)){
            return 0;
        }

        List<String> list = Arrays.stream(first.split(""))
                .collect(Collectors.toList());

        for (int i = 0; i < first.length(); i++) {
            Collections.rotate(list, 1);
            rotationCounter++;
            if(String.join("", list).equals(second)) {
                isRotated = true;
                break;
            }
        }

        return isRotated ? rotationCounter : -1;
    }
}