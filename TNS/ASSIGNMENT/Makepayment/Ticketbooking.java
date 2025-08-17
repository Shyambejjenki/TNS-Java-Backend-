package tns.assignment.makepayment;
import java.util.Scanner;
public class Ticketbooking {
	private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public Ticketbooking() {}

    // Parameterized constructor
    public Ticketbooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded payment methods
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    public void makePayment(String cardHolderName, double amount, String cardType, String ccv) {
        System.out.printf("Holder name:%s\n", cardHolderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, cardType);
        System.out.printf("CCV:%s\n", ccv);
    }

    // Display receipt
    public void displayReceipt() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }
}

