package pl.globallogic.sessions.s11.birthdayservice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class BirthdayManagementService {
    private Map<String, LocalDate> birthdays;

    public BirthdayManagementService() {
        birthdays = new HashMap<>();
    }

    public LocalDate addBirthday(String fullName, int day, int month, int year) {
        //  Construct birthday date
        LocalDate birthdayDate = LocalDate.of(year, month, day);

        //  Put the date with full name into map
        birthdays.put(fullName, birthdayDate);

        return birthdayDate;
    }

    public Optional<LocalDate> getBirthdayFor(String fullName) {

        if (birthdays.containsKey(fullName)) {
            return Optional.of(birthdays.get(fullName));
        } else {
            return Optional.empty();
        }
    }

    public Integer getAgeInYear(String fullName, int year) {
        LocalDate birthday = getBirthdayFor(fullName).get();
        Period period = Period.between(birthday, birthday.withYear(year));
        return period.getYears();
    }

    public int getDaysUntilBirthday(String fullName) {
        //  TODO: fix issue with wrong day calculation
        return Period.between(LocalDate.now(), getBirthdayFor(fullName).get()).getDays();
    }

    public Set<String> getBirthdaysIn(Month month) {
        return birthdays.entrySet().stream()
                .filter(bd -> bd.getValue().getMonth() == month)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public Set<String> getBirthdaysInCurrentMonth() {
        return getBirthdaysIn(LocalDate.now().getMonth());
    }

    public int getTotalAgeInYears() {
        return birthdays.keySet().stream()
                .mapToInt(p -> getAgeInYear(p, LocalDate.now().getYear()))
                .sum();
    }
}
