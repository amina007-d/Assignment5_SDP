package facadepattern;

import facadepattern.facade.RestaurantFacade;
import facadepattern.subsystems.*;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        Cashier billing = new Cashier();
        Delivery delivery = new Delivery();

        RestaurantFacade restaurant = new RestaurantFacade(kitchen, waiter, billing, delivery);

        restaurant.dineIn("Pasta Carbonara", 12.99f);
        restaurant.orderDelivery("Bahandi Chicken Combo", 10.50f, "Kabanbay Batyr 60/1");
    }
}
