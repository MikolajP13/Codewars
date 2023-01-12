public class Kata {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] resultMatrix = new int[a.length][a.length];

        if(a.length != b.length){
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                resultMatrix[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultMatrix;
    }
}