package facadepattern.subsystems;

public class Waiter {
    public void takeOrder(String dish) {
        System.out.println("Waiter: order received for " + dish);
    }

    public void serveDish(String dish) {
        System.out.println("Waiter: serving " + dish + " to the customer.");
    }
}
