package by.tms.onl30.lesson17.tariningmanual;

import by.tms.onl30.lesson17.tariningmanual.interfaces.IShape;
import by.tms.onl30.lesson17.tariningmanual.interfaces.MyLogic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static by.tms.onl30.lesson17.tariningmanual.entities.MyParser.getDayWeekRussian;
import static java.lang.Math.abs;

public class ExecutorTrainingManual {
    public static void main(String[] args) {
//        Написать программу для вывода на консоль названия дня недели по введенной дате.
        String formatDate = "dd-MM-yyyy";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Date in format " + formatDate.toUpperCase() + ": ");
        String date = scanner.next();
        System.out.println(getDayWeekRussian(LocalDate.parse(date, DateTimeFormatter.ofPattern(formatDate)).getDayOfWeek().name()));

//        Написать программу для вывода на экран дату следующего вторника
        int requiredDay = 2; // вторник - 2-й день недели :)
        int dateIndentation = abs(LocalDate.now().getDayOfWeek().getValue() - 7) + requiredDay;
        System.out.println(LocalDate.now().plusDays(dateIndentation));

//        Создать интерфейс IShape с методом getSquare(int x, int y). Используя лямбда-
//                выражения, реализовать его для квадрата(a*b) и треугольника(0.5a*h)
        int base = 2;
        int height = 5;
        IShape shapeTriangle = (a, b) -> (a * b) / 2;
        IShape shapeSquare = (a, b) -> a * b;
        System.out.println(shapeTriangle.getSquare(base, height));
        System.out.println(shapeSquare.getSquare(base, height));

//        При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
//        а. Если a > b, то вернуть b. Иначе вернуть 0
        MyLogic myLogic = new MyLogic() {
            @Override
            public int compare(int a, int b) {
                if (a < b) {return a;}
                else if (a > b) {return b;}
                else {return 0;}
            }
        };
        System.out.println(myLogic.compare(2, 4));
        System.out.println(myLogic.compare(5, 4));
        System.out.println(myLogic.compare(4, 4));
    }
}