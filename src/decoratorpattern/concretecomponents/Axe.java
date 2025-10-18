package decoratorpattern.concretecomponents;
import decoratorpattern.component.IWeapon;

public class Axe implements IWeapon {
    private String description = "Basic Axe";
    private int damage = 15;

    public void setName(String description){
        this.description = description;
    }

    public void setDamage(int damage){
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
