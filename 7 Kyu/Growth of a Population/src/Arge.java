class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int yearsToReachPopulation = 0;
        percent = percent/100;

        while (p0 < p){
            p0 = (int) (p0 + p0*percent + aug);
            System.out.println(p0);
            yearsToReachPopulation++;
        }

        return yearsToReachPopulation;
    }
}