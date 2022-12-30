import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneWords {

    public static String phoneWords(String str) {
        String letterCode;
        int max1 = 1;
        int max2 = 1;

        Map<String, String> codeLetterMap = new HashMap<>(Map.ofEntries(
                Map.entry("0", " "),Map.entry("1", ""),
                Map.entry("2","a"),Map.entry("22","b"), Map.entry("222","c"),
                Map.entry("3","d"),Map.entry("33","e"), Map.entry("333","f"),
                Map.entry("4","g"),Map.entry("44","h"), Map.entry("444","i"),
                Map.entry("5","j"),Map.entry("55","k"), Map.entry("555","l"),
                Map.entry("6","m"),Map.entry("66","n"), Map.entry("666","o"),
                Map.entry("8","t"),Map.entry("88","u"), Map.entry("888","v"),
                Map.entry("7","p"),Map.entry("77","q"), Map.entry("777","r"),Map.entry("7777","s"),
                Map.entry("9","w"),Map.entry("99","x"), Map.entry("999","y"),Map.entry("9999","z")
        ));

        StringBuilder letter = new StringBuilder();
        StringBuilder message = new StringBuilder();

        if(str == null || str.length() == 0){
            return "";
        }

        List<String> list = Arrays.stream(str.split("")).toList();

        for (int i = 0; i < list.size(); i++){
            letterCode = list.get(i);
            letter.append(letterCode);

            if(i+1 == list.size() || letterCode.matches("0|1")
                    || max1==3 || max2 == 4
                    || !letterCode.equals(list.get(i+1))){

                message.append(codeLetterMap.get(letter.toString()));

                letter = new StringBuilder();
                max1 = 1;
                max2 = 1;
            }else{
                switch (list.get(i)){
                    case "7", "9" -> max2++;
                    default -> max1++;
                }
            }
        }

        return message.toString();
    }

}