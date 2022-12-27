import java.util.List;
import java.util.*;

public class BallotsCounter {


    public static String getWinner(final List<String> listOfBallots) {
        final long VOTES = listOfBallots.size();
        String winner = null;
        Set<String> candidates = new HashSet<>(listOfBallots);
        Map<String, Integer> candidatesMap = new HashMap<>();
        candidates.forEach(x -> candidatesMap.put(x, 0));

        listOfBallots.forEach(v -> {
            if(candidatesMap.containsKey(v)){
                candidatesMap.replace(v, candidatesMap.get(v)+1);
            }
        });

        for (Map.Entry<String, Integer> entry: candidatesMap.entrySet()) {
            if(entry.getValue() > VOTES/2){
                winner = entry.getKey();
            }
        }
        return winner;
    }
}