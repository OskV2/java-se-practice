package pl.globallogic.sessions.s5.inheritance;

public class TestEngineer extends Employee {
    private String ongoingProject;
    private boolean isOnBench;
    private String programmingLanguage;

    public TestEngineer(String employeeId, String firstName, String lastName, String ongoingProject, boolean isOnBench, String programmingLanguage) {
        super(employeeId, firstName, lastName);
        this.ongoingProject = ongoingProject;
        this.isOnBench = isOnBench;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.printf("%s %s is working. \n", firstName, lastName);
    }

    @Override
    public void takeBreak() {
        System.out.printf("%s %s is taking a break. \n", firstName, lastName);
    }

    @Override
    public void displayInfo () {
        System.out.printf("Employee Id: %s, Full Name: %s, Project: %s \n", getEmployeeId(), fullTitle(), ongoingProject);
    }

    public void designTestCases(String testCaseTitle) {
        System.out.printf("%s %s working on test design for: %s. \n", firstName, getLastName(), testCaseTitle);
    }

    public String fullTitle() {
        return "Test Engineer: " + firstName + " " + lastName;
    }
}
