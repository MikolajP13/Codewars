class Diamond {
    public static String print(int n) {
        StringBuilder sb = new StringBuilder();
        int diamonds = -1;

        if(n < 0 || n%2 == 0){
            return null;
        }

        for (int i = 0; i <= n/2; i++) {
            diamonds += 2;
            sb.append(" ".repeat((n - diamonds)/2));
            sb.append("*".repeat(Math.max(0, diamonds)));
            sb.append("\n");
        }

        for (int i = 0; i < n/2; i++) {
            diamonds -= 2;
            sb.append(" ".repeat((n - diamonds)/2));
            sb.append("*".repeat(Math.max(0, diamonds)));
            sb.append("\n");
        }

        return sb.toString();
    }
}