package pl.globallogic.sessions.s5.polymorphism;

public interface Switchable {
    int INTERFACE_CONSTANT = 10;

    static void printConstant() { System.out.println(INTERFACE_CONSTANT); }
    default String getManufacturer() {  //  YOU CAN HAVE DEFAULT METHODS IN INTERFACES
        return "Something";
    };
    void switchOn();
    void switchOff();
}
