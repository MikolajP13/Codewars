public class PigLatin {
    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        String thirdElement = "ay";

        for (int i = 0; i < strings.length; i++) {

            if (strings[i].matches("[A-Za-z]+")){
                StringBuilder firstElement = new StringBuilder(strings[i].substring(1));
                String secondElement = strings[i].substring(0,1);

                StringBuilder completeString = firstElement.append(secondElement).append(thirdElement);
                strings[i] = completeString.toString();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String string:strings) {
            sb.append(string).append(" ");
        }

        return sb.toString().trim();
    }
}