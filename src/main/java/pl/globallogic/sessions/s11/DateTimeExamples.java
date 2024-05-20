package pl.globallogic.sessions.s11;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExamples {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDateTime creationDate = LocalDateTime.now();
        LocalDateTime customDateTime = LocalDateTime.of(2024, 6, 9, 14, 34);
        LocalDate date = LocalDate.of(2024, 5, 10);
        System.out.println(date);
    }
}
