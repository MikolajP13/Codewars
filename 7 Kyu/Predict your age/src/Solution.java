public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int predictAge = 0;
        int[] ages = new int[]{age1, age2, age3, age4, age5, age6, age7, age8};

        for (int age : ages) {
            predictAge += age * age;
        }

        return (int) (Math.sqrt(predictAge)/2);
    }
}