import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {
    public static String walk(String path) {
        StringBuilder command = new StringBuilder();
        List<String> listOfCommands = new ArrayList<>();
        String take = "Take ";
        String step = " step";
        int counter = 0;

        if(path.isEmpty())
            return "Paused";

        Map<String, String> commandDescrMap = Map.ofEntries(
                Map.entry("^", "up"), Map.entry("v", "down"),
                Map.entry("<", "left"), Map.entry(">", "right")
        );

        List<String> pathSigns = Arrays.stream(path.split("")).toList();

        for (int i = 0; i < pathSigns.size(); i++) {
            String sign = pathSigns.get(i);
            for (int j = i; j < pathSigns.size(); j++) {
                if(sign.equals(pathSigns.get(j)))
                    counter++;
                else
                    break;
            }

            command.append(take)
                    .append(counter)
                    .append(counter > 1 ? step+"s " : step + " ")
                    .append(commandDescrMap.get(sign));

            listOfCommands.add(command.toString());

            command = new StringBuilder();
            i += counter-1;
            counter = 0;
        }

        return String.join("\n", listOfCommands);
    }
}