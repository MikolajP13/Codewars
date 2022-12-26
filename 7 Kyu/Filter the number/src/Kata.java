public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[^\\d]", ""));
    }
}