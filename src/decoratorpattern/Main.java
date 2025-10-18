package decoratorpattern;

import decoratorpattern.component.IWeapon;
import decoratorpattern.concretecomponents.Sword;
import decoratorpattern.concretedecorators.FireEnchantment;
import decoratorpattern.concretedecorators.IceEnchantment;
import decoratorpattern.concretedecorators.PoisonEnchantment;

public class Main {
    public static void main(String[] args) {
        IWeapon weapon = new IceEnchantment(new PoisonEnchantment(new FireEnchantment(new Sword())));
        System.out.println("Weapon: " + weapon.getDescription());
        System.out.println("Damage: " + weapon.getDamage());

    }
}