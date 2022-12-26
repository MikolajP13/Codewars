public class SquareDigit {

    public int squareDigits(int n) {
        String digits = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
            int x = digits.charAt(i)-'0';
            result.append(x*x);
        }

        return Integer.parseInt(result.toString());
    }

}