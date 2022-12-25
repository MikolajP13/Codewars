class Kata {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        String template = " sheep...";

        for (int i = 1; i < num+1; i++) {
            sb.append(i).append(template);
        }

        return sb.toString();
    }
}