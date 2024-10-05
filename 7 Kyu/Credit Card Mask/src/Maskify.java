public class Maskify {
    public static String maskify(String str) {
        return str.length() <= 4 ?
                str : "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
    }
}