package facadepattern.subsystems;

public class Cashier {
    public void createBill(String dish, float price) {
        System.out.println("Billing: creating bill for " + dish + " - $" + price);
    }

    public void processPayment(float price) {
        System.out.println("Billing: payment of $" + price + " received. Thank you!");
    }
}
