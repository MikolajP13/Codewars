import java.util.*;

public class EasyBal {

    public static String balance(String book) {
        Locale.setDefault(Locale.US);
        final String originalBalanceStr = "Original Balance: ";
        final String balanceStr = " Balance ";
        final String totalStr = "Total expense  ";
        final String averageStr = "Average expense  ";
        final String newLine = "\\r\\n";
        double price;
        double total = 0.0;
        int itemsCounter = 0;

        StringBuilder sb = new StringBuilder();

        List<String> checkBook = Arrays.stream(book.split("\n+"))
                .map(b -> b.replaceAll("[^A-Za-z0-9.\\s]", ""))
                .map(b -> b.replaceAll("([0-9\\.]+) ([A-Za-z]+) ([0-9\\.]+)", "$1 $2 $3"))
                .map(b -> b.replaceAll("\\s+", " "))
                .map(String::trim)
                .toList();

        double balance = Double.parseDouble(checkBook.get(0));

        sb.append(originalBalanceStr).append(String.format("%.2f",balance)).append(newLine);

        for (int i = 1, checkBookSize = checkBook.size(); i < checkBookSize; i++) {
            String record = checkBook.get(i);
            String[] recordArr = record.split("\\s+");
            price = Double.parseDouble(recordArr[recordArr.length-1]);
            total += price;
            itemsCounter++;
            balance -= price;
            sb.append(record).append(balanceStr).append(String.format("%.02f", balance)).append(newLine);
        }

        sb.append(totalStr).append(String.format("%.2f", total)).append(newLine)
                .append(averageStr).append((String.format("%.2f", total/itemsCounter)));

        return sb.toString();
    }
}