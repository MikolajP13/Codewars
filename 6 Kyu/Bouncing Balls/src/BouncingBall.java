public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        int seeTimes = 0;

        if(h < 0 || !(bounce > 0 && bounce < 1) || window > h){
            return -1;
        }

        while(h > window){
            h *= bounce;
            seeTimes+=2;
        }

        return seeTimes-1;
    }
}