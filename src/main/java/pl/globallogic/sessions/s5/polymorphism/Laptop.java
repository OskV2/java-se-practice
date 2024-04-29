package pl.globallogic.sessions.s5.polymorphism;

public class Laptop implements Switchable {

    private boolean isOn;

    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Laptop is on");
        }
    }

    @Override
    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Laptop is off");
        }
    }

    public void sendEmail(String emailAdress, String text) {
        System.out.printf("You send: '%s' to %s \n", text, emailAdress);
    }
}
