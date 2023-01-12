import java.util.*;
import java.util.stream.Collectors;

public class Stat {
    public static String stat(String strg) {
        if(strg.isEmpty())
            return "";

        StringBuilder statistic = new StringBuilder("Range: ");

        List<Integer> runnersResults = Arrays.stream(strg.split(",\\s"))
                .map(s -> {
                    String[] arr = s.split("\\|");
                    return Integer.parseInt(arr[0]) * 3600
                            + Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]);
                })
                .sorted()
                .toList();

        int listSize = runnersResults.size();

        int[] statisticsInSeconds = new int[3];
        statisticsInSeconds[0] = runnersResults.get(listSize-1) - runnersResults.get(0);
        statisticsInSeconds[1] = runnersResults.stream().mapToInt(i -> i).sum()/ listSize;
        statisticsInSeconds[2] = listSize%2 != 0 ?
                runnersResults.get(listSize/2) : (runnersResults.get(listSize/2-1) + runnersResults.get(listSize/2))/2;

        List<String> statisticsInHMS = Arrays.stream(statisticsInSeconds)
                .mapToObj(sec -> String.format("%02d:%02d:%02d", sec / 3600, (sec % 3600) / 60, sec % 60))
                .map(str -> str.replaceAll(":", "|"))
                .toList();

        for (int i = 0; i < statisticsInHMS.size(); i++) {
            String formatted = Arrays.stream(statisticsInHMS.get(i).split("\\s")).map(s -> s.length() == 1 ? "0" + s : s).collect(Collectors.joining("|"));
            switch (i){
                case 1 -> statistic.append("Average: ");
                case 2 -> statistic.append("Median: ");
            }
            statistic.append(formatted).append(" ");
        }

        return statistic.toString().trim();
    }

}