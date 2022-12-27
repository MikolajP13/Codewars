import java.util.*;

class Solution{

    static String toCamelCase(String s){
//        StringBuilder result = new StringBuilder();
//        String[] words = s.split("_|-");
//
//        result.append(words[0]);
//
//        for (int i = 1; i < words.length; i++) {
//            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
//            result.append(words[i]);
//        }

        String[] words = s.split("_|-");
        final boolean[] isFirst = {true};

        List<String> collect = Arrays.stream(words)
                .map(word -> {
                    if(!isFirst[0]) {
                        return word.substring(0, 1).toUpperCase() + word.substring(1);
                    }
                    isFirst[0] = false;
                    return word;
                })
                .toList();

        return String.join("", collect);
    }
}