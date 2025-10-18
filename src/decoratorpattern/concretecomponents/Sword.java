package decoratorpattern.concretecomponents;
import decoratorpattern.component.IWeapon;

public class Sword implements IWeapon {
    private String description = "Basic Sword";
    private int damage = 20;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String description) {
        this.description = description;
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

