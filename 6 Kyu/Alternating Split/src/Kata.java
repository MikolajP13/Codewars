public class Kata {
    public static String encrypt(final String text, final int n) {
        int times = n;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        if (text == null || text.length() == 0 || n <= 0) {
            return text;
        }

        String[] array = text.split("");

        while (times > 0) {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    left.append(array[i]);
                } else {
                    right.append(array[i]);
                }
            }
            array = left.append(right).toString().split("");
            left.setLength(0);
            right.setLength(0);
            times--;
        }

        return String.join("", array);
    }

    public static String decrypt(final String encryptedText, final int n) {
        int times = n;
        String text = encryptedText;
        StringBuilder result = new StringBuilder();

        if (encryptedText == null || encryptedText.length() == 0 || n <= 0) {
            return encryptedText;
        }

        while (times > 0) {
            String[] arrayL = text.substring(0, text.length()/2).split("");
            String[] arrayR = text.substring(text.length()/2).split("");
            result.setLength(0);

            for (int i = 0; i < arrayR.length; i++) {
                if (i < arrayL.length)
                    result.append(arrayR[i]).append(arrayL[i]);
                else
                    result.append(arrayR[i]);
            }
            text = result.toString();

            times--;
        }

        return result.toString();
    }

}