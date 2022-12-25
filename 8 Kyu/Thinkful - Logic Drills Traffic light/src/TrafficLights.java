public class TrafficLights {

    public static String updateLight(String current) {
        switch (current){
            case "red" -> {
                return "green";
            }
            case "yellow" -> {
                return "red";
            }
            case "green" -> {
                return "yellow";
            }
            default -> {return null;}
        }
    }

}