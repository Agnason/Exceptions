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
     * ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float),
     * � ���������� ��������� ��������. ���� ������ ������ ����� �� ������ ��������� � ������� ����������,
     * ������ �����, ���������� �������� ��������� � ������������ ���� ������.
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
    ��������� ���, ��� ��� ����
    * ������� 2
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
    ��������� ���, ��� �����
    *������� 3
    public static void main(String[] args) throws Exception {
       try {
           int a = 90;
           int b = 3;
           System.out.println(a / b);
           printSum(23, 234);
           int[] abc = { 1, 2 };
           abc[3] = 9;
       } catch (Throwable ex) {
           System.out.println("���-�� ����� �� ���...");
       } catch (NullPointerException ex) {
           System.out.println("��������� �� ����� ��������� �� null!");
       } catch (IndexOutOfBoundsException ex) {
           System.out.println("������ ������� �� ������� ������ �������!");
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
            System.out.println("�� ���� ������ ������");
        } catch (NullPointerException ex) {
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (Throwable ex) {
            System.out.println("���-�� ����� �� ���...");
        }finally {
            System.out.println("�� ����� ����!");
        }
    }


    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
/*
* ������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������.
* ������������ ������ ���������� ���������, ��� ������ ������ ������� ������
* */
public static void scan2() {
    Scanner scanner= new Scanner(System.in);
        System.out.println("�������� ���-������!!!");
        String enter = scanner.nextLine();
        if (enter.isBlank()) {
            throw new RuntimeException("������ ������ ������� ������");
        }
}


}
