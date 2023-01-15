import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static String getOrder(String input) {

        Map<Integer, String> menu = Map.ofEntries(
                Map.entry(1, "Burger"), Map.entry(2, "Fries"),
                Map.entry(3, "Chicken") , Map.entry(4, "Pizza"),
                Map.entry(5, "Sandwich"), Map.entry(6, "Onionrings"),
                Map.entry(7, "Milkshake"), Map.entry(8, "Coke"));

        String s = input;

        for (Map.Entry<Integer, String> entry : menu.entrySet()) {
            s = s.replaceAll(entry.getValue().toLowerCase(), entry.getKey() + entry.getValue() + " ");
        }

        String order = Arrays.stream(s.split("\\s")).sorted().collect(Collectors.joining(" "));

        return order.replaceAll("\\d", "");
    }
}