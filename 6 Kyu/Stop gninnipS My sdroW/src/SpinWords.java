public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= 5){
                char[] singleWord = words[i].toCharArray();
                for (int j = 0; j < singleWord.length/2; j++) {
                    char temp = singleWord[j];
                    singleWord[j] = singleWord[singleWord.length-1-j];
                    singleWord[singleWord.length-1-j] = temp;
                }
                words[i] = new String(singleWord);
            }
        }
        return String.join(" ", words);
    }
}