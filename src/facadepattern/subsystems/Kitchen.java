package facadepattern.subsystems;

public class Kitchen {
    public void prepareOrder(String dish) {
        System.out.println("Kitchen: preparing " + dish + "...");
        System.out.println("Kitchen: " + dish + " is ready!");
    }
}
