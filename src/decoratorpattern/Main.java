package decoratorpattern;

import decoratorpattern.component.IWeapon;
import decoratorpattern.concretecomponents.*;
import decoratorpattern.concretedecorators.*;

public class Main {
    public static void main(String[] args) {
        IWeapon sword = new BasicWeapon("Basic weapon", 10);
        System.out.println(sword.getDescription() + "Damage: " + sword.getDamage());

        IWeapon firesword = new FireEnchantment(sword, "FireEnchantment", 15);
        System.out.println(firesword.getDescription() + "Damage: " + firesword.getDamage());

        IWeapon icesword = new IceEnchantment(sword, "IceEnchantment", 10);
        System.out.println(icesword.getDescription() + "Damage: " + icesword.getDamage());

    }
}
