package pl.globallogic.sessions.s5.inheritance;

public class Employee {
    private String employeeId;
    protected String firstName;
    protected String lastName;

    public Employee(String employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void work() {
        System.out.printf("%s %s is working. \n", firstName, lastName);
    }

    public void takeBreak() {
        System.out.printf("%s %s is taking a break. \n", firstName, lastName);
    }

    public void displayInfo () {
        System.out.printf("Employee Id: %s, Full Name: %s %s \n", employeeId, firstName, lastName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
