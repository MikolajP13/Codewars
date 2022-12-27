import java.util.*;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            String str1 = array1[i];
            for (int j = 0; j < array2.length; j++) {
                String str2 = array2[j];
                System.out.println(str1 + " " + str2 + ": " + str2.indexOf(str1));
                if(str2.contains(str1)){
                    arrayList.add(array1[i]);
                    break;
                }
            }
        }

        arrayList.sort(Comparator.naturalOrder());

        arrayList = new ArrayList<>(new LinkedHashSet<>(arrayList));

        return arrayList.toArray(new String[0]);
    }
}