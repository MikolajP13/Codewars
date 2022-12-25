public class GrassHopper {

    public static int summation(int n) {

        if(n == 1){
            return n;
        }

        return n+summation(n-1);
    }
}