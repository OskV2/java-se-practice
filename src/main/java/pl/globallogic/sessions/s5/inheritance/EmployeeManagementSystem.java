package pl.globallogic.sessions.s5.inheritance;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee johnDoe = new Employee("1234", "John", "Doe");
        Employee janeSmith = new Employee("2345", "Jane", "Smith");
        Manager garySmith = new Manager("5674", "Garry", "Smith", "OurBank Account Management System", 7);
        TestEngineer mollyBlack = new TestEngineer("5675", "Molly", "Black", "OurBank Account Management System", false, "Java 22");

//        System.out.println(janeSmith.lastName);
//        janeSmith.takeBreak();
//        janeSmith.displayInfo();
//
//        johnDoe.work();
//        johnDoe.displayInfo();
//
//        garySmith.conductMeeting();
//        garySmith.takeBreak();
//
//        mollyBlack.designTestCases("Create account for client");
//        mollyBlack.displayInfo();
//        System.out.println(mollyBlack.fullTitle());

        Employee garySmith2 = new Manager("5674", "Garry", "Smith", "OurBank Account Management System", 7);
//          garySmith.conductMeeting();  CAN DO THAT (Created as Manager)
//          garySmith2.conductMeeting();  CANNOT DO THAT (Created as Employee)
    }
}
