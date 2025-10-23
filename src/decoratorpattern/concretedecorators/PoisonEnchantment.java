package decoratorpattern.concretedecorators;

import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class PoisonEnchantment extends WeaponDecorator {
    private String enchantmentName;
    private int poisonDamage;

    public PoisonEnchantment(IWeapon weapon, String enchantmentName, int poisonDamage) {
        super(weapon);
        this.enchantmentName = enchantmentName;
        this.poisonDamage = poisonDamage;
    }

    public String getEnchantmentName() {
        return enchantmentName;
    }

    public void setEnchantmentName(String enchantmentName) {
        this.enchantmentName = enchantmentName;
    }

    public int getPoisonDamage() {
        return poisonDamage;
    }

    public void setPoisonDamage(int poisonDamage) {
        this.poisonDamage = poisonDamage;
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

