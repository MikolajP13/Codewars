public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName
                .replaceAll("(\\d+_)",
                        "").replaceAll("(\\.(.+))(\\.(.+))$", "$1");
    }
}