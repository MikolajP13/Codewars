class Solution {
    public static String calc(String txt){
        String operator = txt.replaceAll("(\\.)|(\\s)", "");
        String[] dots = txt.split("(\\+)|(-)|(\\*)|(//)");

        for (int i = 0; i < dots.length; i++) {
            dots[i] = dots[i].trim();
        }

        int result = 0;

        switch (operator){
            case "//" -> result = dots[0].length() / dots[1].length();
            case "+" ->  result = dots[0].length() + dots[1].length();
            case "-" ->  result = dots[0].length() - dots[1].length();
            case "*" ->  result = dots[0].length() * dots[1].length();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result; i++) {
            sb.append(".");
        }

        return sb.toString();
    }
}