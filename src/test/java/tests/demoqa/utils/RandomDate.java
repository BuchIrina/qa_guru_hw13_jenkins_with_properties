package tests.demoqa.utils;

import com.github.javafaker.Faker;

public class RandomDate {

    static Faker faker = new Faker();

    public static String getYear() {
        String year = String.valueOf(faker.number().numberBetween(1900, 2100));

        return year;
    }

    public static String getMonth() {
        String month = String.valueOf(faker.random().nextInt(1, 12));
        if (month.equals("1")) {
            month = "January";
        } else if (month.equals("2")) {
            month = "February";
        } else if (month.equals("3")) {
            month = "March";
        } else if (month.equals("4")) {
            month = "April";
        } else if (month.equals("5")) {
            month = "May";
        } else if (month.equals("6")) {
            month = "June";
        } else if (month.equals("7")) {
            month = "July";
        } else if (month.equals("8")) {
            month = "August";
        } else if (month.equals("9")) {
            month = "September";
        } else if (month.equals("10")) {
            month = "October";
        } else if (month.equals("11")) {
            month = "November";
        } else if (month.equals("12")) {
            month = "December";
        }
        return month;
    }

    public static String getDay(String month, String year) {
        int number;
        String day;
        int years = Integer.parseInt(year);

        if (month.equals("February") && (((years % 4 == 0) && (years % 100 != 0)) || (years % 400 == 0))) {
            number = faker.number().numberBetween(1, 29);
        } else if (month.equals("February")) {
            number = faker.number().numberBetween(1, 28);
        } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            number = faker.number().numberBetween(1, 30);
        } else {
            number = faker.number().numberBetween(1, 31);
        }

        if (number < 10) {
            day = "0" + number;
        } else {
            day = "" + number;
        }

        return day;

    }
}