package decoratorpattern.concretedecorators;
import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class FireEnchantment extends WeaponDecorator {
    public FireEnchantment(IWeapon weapon) {
        super(weapon);
    }

    private String enchantmentName = "Fire Enchantment";
    private int fireDamage = 20;

    public void setPoisonDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public void setEnchantmentName(String enchantmentName) {
        this.enchantmentName = enchantmentName;
    }

    @Override
    public String getDescription() {
        return decoratedWeapon.getDescription() + " + " + enchantmentName;
    }

    @Override
    public int getDamage() {
        return decoratedWeapon.getDamage() + fireDamage;
    }
}