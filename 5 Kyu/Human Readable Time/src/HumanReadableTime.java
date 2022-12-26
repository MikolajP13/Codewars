public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        if(seconds == 0){
            return "00:00:00";
        }

        return String.format("%02d:%02d:%02d", seconds/3600, (seconds%3600)/60, seconds%60);
    }
}