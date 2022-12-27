import java.util.*;
import java.util.stream.IntStream;

class Rank {
    public static String nthRank(String st, Integer[] we, int n) {

        if(st.length() == 0){
            return "No participants";
        }

        List<String> names = Arrays.stream(st.split(",")).toList();
        String[] strArr = names.toArray(new String[0]);
        List<String> namesList = names.stream().map(String::toUpperCase).toList();

        if(n > strArr.length) {
            return "Not enough participants";
        }

        int[] nameSum = namesList.stream().mapToInt(name -> name.length() +
                        Arrays.stream(name.split(""))
                                .mapToInt(l -> (int) l.charAt(0) - 64)
                                .sum())
                .toArray();

        int[] nameSumMultiplyByWeigth = IntStream.range(0, strArr.length)
                .map(i -> nameSum[i] * we[i])
                .toArray();

        for (int i = 0; i < nameSumMultiplyByWeigth.length - 1; i++){
            for (int j = 0; j < nameSumMultiplyByWeigth.length - i - 1; j++)
                if (nameSumMultiplyByWeigth[j] < nameSumMultiplyByWeigth[j + 1]) {
                    int tempInt = nameSumMultiplyByWeigth[j];
                    String tempString = strArr[j];
                    nameSumMultiplyByWeigth[j] = nameSumMultiplyByWeigth[j + 1];
                    nameSumMultiplyByWeigth[j + 1] = tempInt;
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = tempString;
                } else if (nameSumMultiplyByWeigth[j] == nameSumMultiplyByWeigth[j + 1]){
                    if(strArr[j].compareTo(strArr[j+1]) >= 0){
                        String tempString = strArr[j];
                        strArr[j] = strArr[j+1];
                        strArr[j+1] = tempString;
                    }
                }
        }

        return strArr[n-1];
    }
}