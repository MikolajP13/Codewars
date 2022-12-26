public class Movie {

    public static int movie(int card, int ticket, double perc) {
        double totalCardPrice = card;
        double totalTicketsPrice = 0;
        int ticketNumber = 0;

        while (Math.ceil(totalCardPrice) >= totalTicketsPrice){

            totalCardPrice += ticket * Math.pow(perc, ticketNumber);
            totalTicketsPrice += ticket;
            ticketNumber++;
        }

        return ticketNumber-1;
    }
}