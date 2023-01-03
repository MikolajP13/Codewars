public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        if(startPriceOld >= startPriceNew){
            return new int[]{0, startPriceOld-startPriceNew};
        }

        boolean hasEnoughMoney = false;
        int monthCounter = 0;
        double oldCarPrice = startPriceOld;
        double extraSavedMoney = savingperMonth;
        double newCarPrice = startPriceNew;
        double actualPercent;
        int leftOver = 0;

        while (!hasEnoughMoney){
            monthCounter++;

            if (monthCounter%2 == 0){
                percentLossByMonth += 0.5;
            }

            actualPercent = (100 - percentLossByMonth)/100;

            oldCarPrice *= actualPercent;
            newCarPrice *= actualPercent;

            if(oldCarPrice + extraSavedMoney >= newCarPrice){
                leftOver = (int) Math.round(oldCarPrice + extraSavedMoney - newCarPrice);
                hasEnoughMoney = true;
            }

            extraSavedMoney += savingperMonth;

        }

        return new int[]{monthCounter, leftOver};
    }
}