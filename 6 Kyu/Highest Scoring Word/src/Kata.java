public class Kata {
    public static String high(String s) {
        int value = 0, highScore = Integer.MIN_VALUE;
        String highScoreWord = "";
        String[] words = s.split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                value += word.charAt(i) - 96;
            }

            if(value > highScore){
                highScore = value;
                highScoreWord = word;
            }
            value = 0;
        }

        return highScoreWord;
    }

}