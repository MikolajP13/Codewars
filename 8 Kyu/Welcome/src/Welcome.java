import java.util.*;

public class Welcome {
    public static String greet(String language){

        Map<String, String> languagesAndGreetings = Map.ofEntries(
                Map.entry("english", "Welcome"), Map.entry("czech", "Vitejte"),
                Map.entry("danish", "Velkomst"), Map.entry("latvian", "Gaidits"),
                Map.entry("estonian", "Tere tulemast"), Map.entry("lithuanian", "Laukiamas"),
                Map.entry("finnish", "Tervetuloa"), Map.entry("polish", "Witamy"),
                Map.entry("flemish", "Welgekomen"), Map.entry("spanish", "Bienvenido"),
                Map.entry("french", "Bienvenue"), Map.entry("swedish", "Valkommen"),
                Map.entry("german", "Willkommen"), Map.entry("welsh", "Croeso"),
                Map.entry("irish", "Failte"), Map.entry("italian", "Benvenuto"),
                Map.entry("dutch", "Welkom")
        );

        boolean searchResult = languagesAndGreetings.entrySet().stream().anyMatch(lang -> lang.getKey().equals(language));

        return searchResult ? languagesAndGreetings.get(language) : "Welcome";
    }
}