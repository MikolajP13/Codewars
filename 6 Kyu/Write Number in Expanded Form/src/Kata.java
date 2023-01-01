public class Kata{

    public static String expandedForm(int num) {
        int divider;
        int expandedFormChunk;
        int numLength = String.valueOf(num).replaceAll("0","").length();
        StringBuilder sb = new StringBuilder("1");
        StringBuilder result = new StringBuilder();

        if(numLength == 1){
            return result.append(num).toString();
        }

        for (int i = 0; i < numLength; i++) {
            sb.append("0".repeat(Math.max(0, String.valueOf(num).length() - 1)));
            divider = Integer.parseInt(sb.toString());

            expandedFormChunk = num/divider;
            if(i == numLength - 1){
                result.append(expandedFormChunk * divider);
            }else {
                result.append(expandedFormChunk * divider).append(" + ");
            }
            num = num - expandedFormChunk * divider;
            sb = new StringBuilder("1");
        }

        return result.toString();
    }
}