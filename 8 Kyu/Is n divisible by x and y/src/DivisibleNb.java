public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        boolean isDivisible = true;

        if(n%x != 0 || n%y != 0){
            isDivisible = false;
        }

        return isDivisible;
    }
}