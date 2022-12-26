class RobinsonCrusoe {

    public static double[] crusoe(int n, double d, int ang, double distmult, double angmult) {
        double x = 0;
        double y = 0;
        double angle = ang;

        for (int i = 0; i < n; i++) {
            double radsVal = Math.toRadians(angle);
            y += Math.sin(radsVal) * d;
            x += Math.cos(radsVal) * d;
            d *= distmult;
            angle *= angmult;
        }
        return new double[]{x, y};
    }
}