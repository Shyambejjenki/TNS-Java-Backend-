package tns.assignment.makepayment;

import java.util.Scanner;

public class Ticketmain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String bookingDetails = sc.nextLine();
            if (bookingDetails.isEmpty()) break;

            String[] details = bookingDetails.split(",");
            TicketBooking booking = new TicketBooking(details[0], details[1], Integer.parseInt(details[2]));

            int paymentMode = Integer.parseInt(sc.nextLine());

            booking.displayReceipt();

            switch (paymentMode) {
                case 1:
                    double cashAmount = Double.parseDouble(sc.nextLine());
                    booking.makePayment(cashAmount);
                    break;
                case 2:
                    double walletAmount = Double.parseDouble(sc.nextLine());
                    String walletNumber = sc.nextLine();
                    booking.makePayment(walletAmount, walletNumber);
                    break;
                case 3:
                    String cardHolder = sc.nextLine();
                    double cardAmount = Double.parseDouble(sc.nextLine());
                    String cardType = sc.nextLine();
                    String ccv = sc.nextLine();
                    booking.makePayment(cardHolder, cardAmount, cardType, ccv);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
	

	
	    
	


}
