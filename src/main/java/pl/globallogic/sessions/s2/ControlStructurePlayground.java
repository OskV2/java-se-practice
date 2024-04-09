package pl.globallogic.sessions.s2;

import java.util.Scanner;

public class ControlStructurePlayground {
    public static void main(String[] args) {
        // age();
        // months();
        forExample();
    }

    public static void age() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide kids age: ");
        int age = scan.nextInt();
        String rating = "13+ (kid)";
        if (age >= 18) {
            rating = "A";
            System.out.println("User rating has been set to A");
        } else if (age > 13 && age < 18) {
            rating = "13+ (middle school)";
        } else if (age < 13 && age > 10) {
            rating = "10+ (school)";
        } else {
            rating = "7+ (kid)";
        }
        System.out.println("Rating after evaluation: " + rating);
        scan.close();
    }

    public static void months() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favourite month of the year:");
        String month = scan.nextLine().toLowerCase();
//        String season = "";

//        switch(month) {
//            case "december":    season="winter"; break;
//            case "january":     season="winter"; break;
//            case "february":    season="winter"; break;
//            case "march":       season="spring"; break;
//            case "april":       season="spring"; break;
//            case "may":         season="spring"; break;
//            case "june":        season="summer"; break;
//            case "july":        season="summer"; break;
//            case "august":      season="summer"; break;
//            case "september":   season="autumn"; break;
//            case "october":     season="autumn"; break;
//            case "november":    season="autumn"; break;
//            default: System.out.println("There is no month called " + month);
//        }

        String season = switch(month) {
            case "december", "january", "february" -> "winter";
            case "march", "april", "may" -> "spring";
            case "june", "july", "august" -> "summer";
            case "september", "october", "november" -> "autumn";
            default -> "No month like this";
        };
        System.out.println("You picked " + month + " as your favourite month. In this month we have " + season);
        scan.close();
    }

    public static void forExample () {
        for (int i = 0; i < 5; i++) {
            i++;
            System.out.println("Print No." + i );
            i--;
        }

        for (int j=0; j<10; j++) {
            if (j==5) continue;
            System.out.println("Iteration No." + j);
        }
    }
}
