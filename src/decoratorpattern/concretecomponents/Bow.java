package decoratorpattern.concretecomponents;
import decoratorpattern.component.IWeapon;

public class Bow implements IWeapon {
    private String description = "Basic Bow";
    private int damage = 35;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
