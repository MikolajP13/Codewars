public class BraceChecker {

    public boolean isValid(String braces) {
        while (braces.contains("()") || braces.contains("[]") || braces.contains("{}")) {
            braces = braces.replaceAll("\\(\\)", "")
                    .replaceAll("\\[]", "")
                    .replaceAll("\\{}", "");
        }
        return braces.length() == 0;
    }
}