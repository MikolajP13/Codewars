public class Greed{
    public static int greedy(int[] dice){
        int score = 0;
        int[] diceScore = new int[6];

        for (int i = 0; i < dice.length; i++) {
            diceScore[dice[i]-1]++;
        }


        score = (diceScore[0]/3)*1000 + (diceScore[0]%3)*100
                + (diceScore[1]/3)*200 + (diceScore[2]/3)*300
                + (diceScore[3]/3)*400 + (diceScore[4]/3)*500
                + (diceScore[4]%3)*50 + (diceScore[5]/3)*600;

        return score;
    }
}