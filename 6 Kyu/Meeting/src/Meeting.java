import java.util.*;

class Meeting {

    public static String meeting(String s) {

        List<String> strings = Arrays.stream(s.split(";"))
                .map(fullName -> {
                    int i = fullName.indexOf(":");
                    return String.format("(%s, %s)",
                            fullName.substring(i+1), fullName.substring(0, i));
                })
                .map(String::toUpperCase)
                .sorted(String::compareTo)
                .toList();

        return String.join("", strings);
    }
}