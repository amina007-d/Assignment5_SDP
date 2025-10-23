package decoratorpattern.concretedecorators;

import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class IceEnchantment extends WeaponDecorator {
    private String enchantmentName;
    private int iceDamage;

    public IceEnchantment(IWeapon weapon, String enchantmentName, int iceDamage) {
        super(weapon);
        this.enchantmentName = enchantmentName;
        this.iceDamage = iceDamage;
    }

    public String getEnchantmentName() {
        return enchantmentName;
    }

    public void setEnchantmentName(String enchantmentName) {
        this.enchantmentName = enchantmentName;
    }

    public int getIceDamage() {
        return iceDamage;
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

