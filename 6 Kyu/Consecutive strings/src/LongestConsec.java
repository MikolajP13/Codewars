class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Integer.MIN_VALUE;
        int wordsLength = 0;
        String longestStr = "";

        if (k > strarr.length || k <= 0) {
            return "";
        }

        for (int i = 0; i < strarr.length; i++) {
            if (i + k > strarr.length) {
                break;
            }
            for (int j = 0; j < k; j++) {
                wordsLength += strarr[i+j].length();
                sb.append(strarr[i+j]);
            }
            if(wordsLength > maxLength){
                maxLength = wordsLength;
                longestStr = sb.toString();

            }
            sb = new StringBuilder();
            wordsLength = 0;
        }

        return longestStr;
    }
}