package facadepattern;

import facadepattern.facade.RestaurantFacade;
import facadepattern.subsystems.*;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();

        restaurant.dineIn("Pasta Carbonara", 12.99f);
        restaurant.orderDelivery("Bahandi Chicken Combo", 10.50f, "Kabanbay Batyr 60/1");
    }
}
