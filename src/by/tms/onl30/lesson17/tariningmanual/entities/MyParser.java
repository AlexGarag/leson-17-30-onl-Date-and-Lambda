package by.tms.onl30.lesson17.tariningmanual.entities;

public class MyParser {
    public static String getDayWeekRussian(String dayWeekEnglish) {
        switch (dayWeekEnglish.toLowerCase()) {
            case "sunday":
                return "воскресенье";
            case "saturday":
                return "суббота";
            case "monday":
                return "понедельник";
            case "tuesday":
                return "вторник";
            case "wednesday":
                return "среда";
            case "thursday":
                return "четверг";
            case "friday":
                return "пятница";
            default:
                throw new IllegalArgumentException("Invalid day week: " + dayWeekEnglish);
        }
    }
}

