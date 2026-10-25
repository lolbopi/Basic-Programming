import java.util.Scanner;

public class TugasBioskopAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TICKET_PRICE = 50000;
        int tickets, totalTickets = 0;
        double totalRevenue = 0;

        System.out.println("=== Cinema Ticket Sales ===");
        System.out.println("Enter the number of tickets for each customer (enter 0 to finish).");

        while (true) {
            System.out.print("Number of tickets: ");
            tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid quantity. Please enter again!");
                continue;
            }
            if (tickets == 0) {
                break;
            }

            double price = tickets * TICKET_PRICE;
            double discount = 0;
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }
            double pay = price - (price * discount);

            System.out.printf("Discount: %.0f%%%n", discount * 100);
            System.out.printf("Total to pay: Rp %.0f%n", pay);

            totalTickets += tickets;
            totalRevenue += pay;
        }

        System.out.println("-------------------------");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.printf("Total revenue: Rp %.0f%n", totalRevenue);
    }
}
