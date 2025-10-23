package decoratorpattern.decorator;

import decoratorpattern.component.IWeapon;

public abstract class WeaponDecorator implements IWeapon {
    protected IWeapon decoratedWeapon;

    public WeaponDecorator(IWeapon weapon) {
        this.decoratedWeapon = weapon;
    }

    public IWeapon getDecoratedWeapon(){
        return decoratedWeapon;
    };

    public void setDecoratedWeapon(IWeapon weapon){
        this.decoratedWeapon = weapon;
    }

    @Override
    public String getDescription() {
        return decoratedWeapon.getDescription();
    }

    @Override
    public int getDamage() {
        return decoratedWeapon.getDamage();
    }
}

