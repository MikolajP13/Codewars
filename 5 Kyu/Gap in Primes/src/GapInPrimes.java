class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long[] result = new long[2];

        for (long s = m; s < n-g ; s++) {
            if(GapInPrimes.isNumPrime(s) && isNumPrime(s+g) && falseGap(s, s+g)){
                result[0] = s;
                result[1] = s+g;
                return result;
            }
        }
        return null;
    }

    public static boolean isNumPrime(long n){
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean falseGap(long x, long y){
        for (long i = x+1; i < y-1; i++) {
            if(isNumPrime(i))
                return false;
        }
        return true;
    }
}