package by.tms.onl30.lesson17.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExecutorHomeWork {
    public static void main(String[] args) {
//        Задача 1:
//        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//        когда пользователю исполнится 100 лет. Использовать Date/Time API
        System.out.println();
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth in the format \"YYYY-MM-DD\": ");
        String dateInput = scanner.nextLine();
        String formatDate = "dd-MM-yyyy";
        LocalDate dateAnniversary = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern(formatDate)).plusYears(100);
        System.out.println(dateAnniversary);

//        Задача 2:
//        Используя Predicate среди массива чисел вывести только те, которые являются
//                положительными
        System.out.println();
        System.out.println("Задача 2");
        int[] array = {1, -5, 19, -1000, 800};
        Predicate<Integer> isRealNumber = i -> i > 0;
        for (int i : array)
            if (isRealNumber.test(i)) {
                System.out.println(i);
            }

//        Задача 3:
//        Используя Function реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        возвращать сумму, переведенную сразу в доллары
        System.out.println();
        System.out.println("Задача 3");

        String regex = "[^0-9.]+";
        String stringSumByn = "*300* BYN";
        double exchangeRateBynUsd = 3.1518;
        Function<String, Double> exchangeByFunction = s -> Integer.parseInt(stringSumByn.replaceAll(regex, "")) / exchangeRateBynUsd;
        System.out.printf("%.4f", exchangeByFunction.apply(stringSumByn));

//        Задача 4:
//        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        выводить сумму, переведенную сразу в доллары
        System.out.println();
        System.out.println("Задача 4");
        Consumer<String> exchange = s -> {
            System.out.printf("%.4f USD", Integer.parseInt(s.replaceAll(regex, "")) / exchangeRateBynUsd);
        };
        exchange.accept(stringSumByn);

//        Используя Supplier написать метод, который будет возвращать введенную с консоли
//        строку задом наперед
        System.out.println();
        System.out.println("Задача 5");

        Supplier<String> supplier = () -> {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Enter any line: ");
            String stringInput = scanner2.nextLine();
            String[] array2 = stringInput.split("");
            String[] newArray = new String[array2.length];
//            List<String> charList = Arrays.asList(array2);
//            Collections.reverse(charList);
            for (int i = 0; i < array2.length; i++) {
                newArray[array2.length - 1 - i] = array2[i];
            }
            return String.join("", newArray);
        };
        String name = supplier.get();
        System.out.println(name);
    }
}
