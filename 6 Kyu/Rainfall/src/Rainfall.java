import java.util.*;

public class Rainfall {

    public static double mean(String town, String strng) {

        if (town == null || strng == null){
            return -1.0;
        }

        String citiesAndRainfalls = String.join("", Arrays.stream(strng.split("\n"))
                .filter(s -> s.matches(town + ":.*"))
                .toList());

        if (citiesAndRainfalls.equals("")) {
            return -1.0;
        }

        double[] rainfallData = Arrays.stream(citiesAndRainfalls.split(",|:")).skip(1)
                .map(s -> s.replaceAll("([A-Za-z]+) (\\d+\\.\\d+)", "$2"))
                .mapToDouble(Double::valueOf).toArray();


        return Arrays.stream(rainfallData, 0, rainfallData.length).summaryStatistics().getAverage();

    }

    public static double variance(String town, String strng) {

        if (town == null || strng == null){
            return -1.0;
        }

        String citiesAndRainfalls = String.join("", Arrays.stream(strng.split("\n"))
                .filter(s -> s.matches(town + ":.*"))
                .toList());

        if (citiesAndRainfalls.equals("")) {
            return -1.0;
        }

        double mean = mean(town, strng);

        double[] rainfallData = Arrays.stream(citiesAndRainfalls.split(",|:")).skip(1)
                .map(s -> s.replaceAll("([A-Za-z]+) (\\d+\\.\\d+)", "$2"))
                .mapToDouble(Double::valueOf)
                .map(d -> Math.pow(d - mean, 2))
                .toArray();

        return Arrays.stream(rainfallData, 0, rainfallData.length).summaryStatistics().getAverage();
    }

}