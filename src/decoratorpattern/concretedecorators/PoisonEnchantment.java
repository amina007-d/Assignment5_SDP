package decoratorpattern.concretedecorators;
import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class PoisonEnchantment extends WeaponDecorator {
    public PoisonEnchantment(IWeapon weapon) {
        super(weapon);
    }

    private String enchantmentName = "Poison Enchantment";
    private int poisonDamage = 15;

    public void setPoisonDamage(int poisonDamage) {
        this.poisonDamage = poisonDamage;
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
        return decoratedWeapon.getDamage() + poisonDamage;
    }
}