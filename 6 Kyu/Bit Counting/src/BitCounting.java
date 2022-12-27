public class BitCounting {

    public static int countBits(int n){
        int bitsEqualOne = 0;
        String result = Integer.toBinaryString(n);
        for (int i = 0; i < result.length(); i++){
            if(result.charAt(i) == '1'){
                bitsEqualOne++;
            }
        }
        return bitsEqualOne;
    }

}