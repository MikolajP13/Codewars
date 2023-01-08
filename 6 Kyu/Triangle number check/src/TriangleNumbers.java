public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        boolean isTriangle = false;
        int n, i = 0;

        while (!isTriangle) {
            i++;
            n = i * (i + 1);
            if (2 * number == n) {
                isTriangle = true;
            }
            if (n > 2 * number) {
                break;
            }
        }

        return isTriangle;
    }
}