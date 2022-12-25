public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return name.substring(0,1).equalsIgnoreCase("R") ?
                name + " plays banjo" : name + " does not play banjo";
    }
}