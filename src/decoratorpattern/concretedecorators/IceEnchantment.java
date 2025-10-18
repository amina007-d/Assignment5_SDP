package decoratorpattern.concretedecorators;
import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class IceEnchantment extends WeaponDecorator {
    public IceEnchantment(IWeapon weapon) {
        super(weapon);
    }

    private String enchantmentName = "Ice Enchantment";
    private int iceDamage = 10;

    public void setEnchantmentName(String enchantmentName) {
        this.enchantmentName = enchantmentName;
    }

    public void setIceDamage(int iceDamage) {
        this.iceDamage = iceDamage;
    }

    @Override
    public String getDescription() {
        return decoratedWeapon.getDescription() + " + " + enchantmentName;
    }

    @Override
    public int getDamage() {
        return decoratedWeapon.getDamage() + iceDamage;
    }
}
