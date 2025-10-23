package facadepattern.facade;
import facadepattern.subsystems.Kitchen;
import facadepattern.subsystems.Waiter;
import facadepattern.subsystems.Cashier;
import facadepattern.subsystems.Delivery;

public class RestaurantFacade {
    private Kitchen kitchen;
    private Waiter waiter;
    private Cashier billing;
    private Delivery delivery;

    public RestaurantFacade() {
        this.kitchen = new Kitchen();
        this.waiter = new Waiter();
        this.billing = new Cashier();
        this.delivery = new Delivery();
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Cashier getCashier() {
        return billing;
    }

    public void setCashier(Cashier billing) {
        this.billing = billing;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void dineIn(String dish, float price) {
        System.out.println("Dine-In Order");
        waiter.takeOrder(dish);
        kitchen.prepareOrder(dish);
        waiter.serveDish(dish);
        billing.createBill(dish, price);
        billing.processPayment(price);
    }

    public void orderDelivery(String dish, float price, String address) {
        System.out.println("Online Delivery Order");
        kitchen.prepareOrder(dish);
        billing.createBill(dish, price);
        billing.processPayment(price);
        delivery.deliverOrder(dish, address);
        System.out.println("Delivery completed.");
    }
}
