class Solution {
    public static String whoLikesIt(String... names) {
        String result = "";

        switch (names.length){
            case 0 -> result = "no one likes this";
            case 1 -> result = String.format("%s likes this", names[0]);
            case 2 -> result = String.format("%s and %s like this", names[0], names[1]);
            case 3 -> result = String.format("%s, %s and %s like this", names[0], names[1],names[2]);
            default -> result = String.format("%s, %s and %d others like this", names[0], names[1], names.length-2);
        }
        return result;
    }
}