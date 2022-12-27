public class Kata
{
    public static char findMissingLetter(char[] array) {
        System.out.println(Character.toChars(65));
        int start = array[0];
        int missing = 0;
        for (int i = 0; i < array.length; i++, start++) {
            if(start != (int) array[i]){
                missing = start;
                break;
            }
        }
        return (char) missing;
    }
}