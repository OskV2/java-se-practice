package pl.globallogic.sessions.s5.inheritance;

public class Manager extends Employee {
    private String project;
    private int teamSize;

    public Manager(String employeeId, String firstName, String lastName, String project, int teamSize) {
        super(employeeId, firstName, lastName);
        this.project = project;
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.printf("%s %s is working. \n", getFirstName(), getLastName());
    }

    @Override
    public void takeBreak() {
        System.out.printf("%s %s is taking a break. \n", getFirstName(), getLastName());
    }

    @Override
    public void displayInfo () {
        System.out.printf("Employee Id: %s, Full Name: %s %s \n", getEmployeeId(), getFirstName(), getLastName());
    }

    public void conductMeeting() {
        System.out.printf("%s %s on the meeting now. \n", getFirstName(), getLastName());
    }
}
