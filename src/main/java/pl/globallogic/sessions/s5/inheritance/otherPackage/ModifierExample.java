package pl.globallogic.sessions.s5.inheritance.otherPackage;

import pl.globallogic.sessions.s5.inheritance.Employee;

public class ModifierExample {
    public static void main(String[] args) {
        Employee janeSmith = new Employee("2345", "Jane", "Smith");
        //  System.out.println(janeSmith.firstname);  CANNOT DO THAT IN OTHER PACKAGE IF VALUE IS PROTECTED
    }
}
