package facadepattern.subsystems;

public class Delivery {
    public void deliverOrder(String dish, String address) {
        System.out.println("Delivery: delivering " + dish + " to " + address);
    }
}

