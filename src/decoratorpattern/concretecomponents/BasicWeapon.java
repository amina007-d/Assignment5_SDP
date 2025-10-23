package decoratorpattern.concretecomponents;

import decoratorpattern.component.IWeapon;

public class BasicWeapon implements IWeapon {
    private String description;
    private int damage;

    public BasicWeapon(String description, int damage) {
        this.description = description;
        this.damage = damage;
    }

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
