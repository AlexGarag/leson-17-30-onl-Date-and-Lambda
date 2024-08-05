package by.tms.onl30.lesson17.homework;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExecutorHomeWork {
    public static void main(String[] args) {
//        Задача 1:
//        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//        когда пользователю исполнится 100 лет. Использовать Date/Time API
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your date of birth in the format \"YYYY-MM-DD\": ");
//        String dateInput = scanner.nextLine();
//        String formatDate = "dd-MM-yyyy";
//        LocalDate dateAnniversary = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern(formatDate)).plusYears(100);
//        System.out.println(dateAnniversary);

//        Задача 2:
//        Используя Predicate среди массива чисел вывести только те, которые являются
//                положительными
//        int[] array = {1, -5, 19, -1000, 800};
//        Predicate<Integer> isRealNumber = i -> i > 0;
//        for (int i : array)
//            if (isRealNumber.test(i)) {
//                System.out.println(i);
//            }

//        Задача 3:
//        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        выводить сумму, переведенную сразу в доллары
        String regex = "[^0-9.]+";
        double exchangeRateBynUsd = 3.1518;
        String sumByn = "*300* BYN";
        Consumer<String> exchange = s -> {
            System.out.printf("%.4f USD", Integer.parseInt(s.replaceAll(regex, "")) / exchangeRateBynUsd);
        };
        exchange.accept(sumByn);
//
//        Consumer<String> exchange = (s) -> System.out.println(s.replaceFirst(finalLine, strSumUsd));
//        exchange.accept(finalLine);

//        todo Задача 5:
//        Используя Supplier написать метод, который будет возвращать введенную с консоли
//        строку задом наперед

//        Supplier<String> supplier = () -> {
//            Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your date of birth in the format \"YYYY-MM-DD\": ");
//        String stringInput = scanner.nextLine();
//            char[] array = stringInput.toCharArray();
//            String str = "Hello World";
//            return str;
//        };
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            return userInput;
        };
    }


}


