package pl.globallogic.sessions.s5.polymorphism;

public class Smartphone implements Switchable {
    private boolean isOn;

    @Override
    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Smartphone is on");
        }
    }

    @Override
    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Smartphone is off");
        }
    }

    public void makeCall (String number) {
        if (isOn) {
            System.out.println("Calling");
        }
    }
}
