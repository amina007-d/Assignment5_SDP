package decoratorpattern.concretedecorators;

import decoratorpattern.component.IWeapon;
import decoratorpattern.decorator.WeaponDecorator;

public class FireEnchantment extends WeaponDecorator {
    private String enchantmentName;
    private int fireDamage;

    public FireEnchantment(IWeapon weapon, String enchantmentName, int fireDamage) {
        super(weapon);
        this.enchantmentName = enchantmentName;
        this.fireDamage = fireDamage;
    }

    public String getEnchantmentName() {
        return enchantmentName;
    }

    public void setEnchantmentName(String enchantmentName) {
        this.enchantmentName = enchantmentName;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
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

