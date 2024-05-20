package pl.globallogic.sessions.s11.birthdayservice;

import java.time.Month;

public class BirthdayServiceTester {
    public static void main(String[] args) {
        BirthdayManagementService service = new BirthdayManagementService();
        service.addBirthday("John Doe", 25, 10, 1988);
        service.addBirthday("John Doe 1", 25, 5, 1988);
        service.addBirthday("John Doe 2", 25, 8, 1988);

        service.getBirthdayFor("John Doe").ifPresent(System.out::println);
        System.out.println("John Doe will have " + service.getAgeInYear("John Doe", 2030) + " years in 2030");
        System.out.println("John Doe's birthday is in " + service.getDaysUntilBirthday("John Doe") + " days");
        System.out.println("In august they will have birthday: " + service.getBirthdaysIn(Month.AUGUST));

        System.out.println("In this month they will have birthday: " + service.getBirthdaysInCurrentMonth());
        System.out.println("How old are my friends in total: " + service.getTotalAgeInYears());
    }
}
