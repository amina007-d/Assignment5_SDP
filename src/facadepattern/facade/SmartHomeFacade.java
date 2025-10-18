package facadepattern.facade;

import facadepattern.subsystems.*;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner ac;
    private DoorLock doorLock;
    private Blinds blinds;

    public SmartHomeFacade() {
        this.light = new Light();
        this.ac = new AirConditioner();
        this.doorLock = new DoorLock();
        this.blinds = new Blinds();
    }

    public Light getLight() {
        return light;
    }

    public AirConditioner getAc() {
        return ac;
    }

    public DoorLock getDoorLock() {
        return doorLock;
    }

    public Blinds getBlinds() {
        return blinds;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setAc(AirConditioner ac) {
        this.ac = ac;
    }

    public void setDoorLock(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    public void setBlinds(Blinds blinds) {
        this.blinds = blinds;
    }

    public void leaveHome() {
        System.out.println("\n Leaving home.");
        light.off();
        ac.stop();
        blinds.close();
        doorLock.lock();
        System.out.println("Home is secured.\n");
    }

    public void arriveHome() {
        System.out.println("\n Arriving home.");
        doorLock.unlock();
        blinds.open();
        light.on();
        ac.start();
        System.out.println("Welcome home!\n");
    }

    public void goodNight() {
        System.out.println("\n Night mode activated.");
        light.off();
        ac.stop();
        blinds.close();
        doorLock.lock();
        System.out.println("All systems set for night.\n");
    }
}
