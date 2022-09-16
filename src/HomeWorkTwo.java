import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
//        System.out.println(scan());
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        ex2(arr, 25, 0);
scan2();

    }

    /*
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     * */

    public static float scan() {

        Scanner scanner;
        String enter;
        do {
            scanner = new Scanner(System.in);
            System.out.println("Write number");
            enter = scanner.nextLine();
        }
        while (!enter.matches("-?\\d+"));
        return Float.parseFloat(enter);
    }

    /*
    Исправьте код, там где надо
    * Задание 2
    try {
       int d = 0;
       double catchedRes1 = intArray[8] / d;
       System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
       System.out.println("Catching exception: " + e);
    }
    * */
    public static void ex2(int[] array, int index, int d) {
        try {
            int catchedRes1 = array[index] / d;
            System.out.println("catchedRes1 = " + (double) catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    /*
    Исправьте код, где можно
    *Задание 3
    public static void main(String[] args) throws Exception {
       try {
           int a = 90;
           int b = 3;
           System.out.println(a / b);
           printSum(23, 234);
           int[] abc = { 1, 2 };
           abc[3] = 9;
       } catch (Throwable ex) {
           System.out.println("Что-то пошло не так...");
       } catch (NullPointerException ex) {
           System.out.println("Указатель не может указывать на null!");
       } catch (IndexOutOfBoundsException ex) {
           System.out.println("Массив выходит за пределы своего размера!");
       }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
       System.out.println(a + b);
    }
    * */
    public static void ex3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            Integer[] abc = new Integer[5];
            abc[3] = null;
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }finally {
            System.out.println("Да будет свет!");
        }
    }


    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
/*
* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
* Пользователю должно показаться сообщение, что пустые строки вводить нельзя
* */
public static void scan2() {
    Scanner scanner= new Scanner(System.in);
        System.out.println("Напишите что-нибудь!!!");
        String enter = scanner.nextLine();
        if (enter.isBlank()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
}


}
