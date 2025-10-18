package facadepattern;

import facadepattern.facade.SmartHomeFacade;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.arriveHome();
        home.leaveHome();
        home.goodNight();

        home.getLight().off();
        home.getBlinds().close();

    }
}
