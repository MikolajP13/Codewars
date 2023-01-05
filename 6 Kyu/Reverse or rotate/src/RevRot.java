import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RevRot {

    public static String revRot(String strng, int sz) {
        StringBuilder sbResult = new StringBuilder();

        if(strng.isEmpty() || sz <= 0 || sz > strng.length()){
            return "";
        }

        List<String> chunks = Arrays.stream(strng.split("(?<=\\G.{" + sz + "})"))
                .toList();

        for (int i = 0; i < chunks.size(); i++) {
            if(chunks.get(i).length() == sz){
                int sum = Stream.of(chunks.get(i).split(""))
                        .mapToInt(Integer::valueOf)
                        .map(n -> n*n)
                        .sum();
                if(sum%2 == 0){
                    sbResult.append(new StringBuilder(chunks.get(i)).reverse());
                } else{
                    List<String> temp = Arrays.stream(chunks.get(i)
                                    .split(""))
                            .collect(Collectors.toList());
                    Collections.rotate(temp, temp.size()-1);
                    sbResult.append(String.join("", temp));
                }
            }
        }
        return sbResult.toString();
    }
}