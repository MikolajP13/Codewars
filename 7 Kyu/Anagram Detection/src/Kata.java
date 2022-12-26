import java.util.*;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        List<String> list1 = Arrays.stream(test.split("")).map(String::toLowerCase).sorted().toList();
        List<String> list2 = Arrays.stream(original.split("")).map(String::toLowerCase).sorted().toList();

        return list1.equals(list2);
    }
}