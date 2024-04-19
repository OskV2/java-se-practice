package pl.globallogic.sessions.s5.polymorphism;

public class DeviceSwitcher {
    public static void main(String[] args) {
        Switchable laptop = new Laptop();
        Switchable smartphone = new Smartphone();

        laptop.switchOn();
        ((Laptop)laptop).sendEmail("a@b.com", "Some text");
        System.out.println(laptop.getManufacturer());
        laptop.switchOff();

        smartphone.switchOn();
        ((Smartphone)smartphone).makeCall("123456789");
        System.out.println(smartphone.getManufacturer());
        smartphone.switchOff();

        Switchable.printConstant();
    }
}
