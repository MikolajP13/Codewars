public class Multiplication{
    public static int [][] multiplicationTable(int n){
        int[][] multiplicationTable = new int[n][n];
        int multiplier = 2;

        for (int i = 0; i < n; i++) {
            multiplicationTable[0][i] = i+1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multiplicationTable[i][j] = multiplicationTable[0][j] * multiplier;
            }
            multiplier++;
        }
        return multiplicationTable;
    }
}