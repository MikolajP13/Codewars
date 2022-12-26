import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int in = 0;
        int off = 0;

//        stops.forEach(i -> System.out.println(Arrays.toString(i)));

        for (int[] i:stops) {
            in+=i[0];
            off+=i[1];
        }

        return in-off > 0 ? in-off : -1;
    }
}