public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (isFound) break;

            result[0] = i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    result[1] = j;
                    isFound = true;
                    break;
                }
            }
        }

        return result;
    }
}