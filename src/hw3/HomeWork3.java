package hw3;

/*
�������� ����������, ������� ����� ����������� � ������������ ��������� ������ � ������������ �������,
����������� ��������:
������� ��� ��������, ���� ��������, ����� ��������, ���
������� ������: �������, ���, �������� - ������
���� �������� - ������ ������� dd.mm.yyyy
����� �������� - ����� ����������� ����� ��� ��������������. �������� 71112223344
��� - ������ ��������� f ��� m.
���������� ������ ��������� ��������� ������ �� ����������. ���� ���������� �� ��������� � ���������,
 ������� ��� ������, ���������� ��� � �������� ������������ ���������,
 ��� �� ���� ������ � ������ ������, ��� ���������.
���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������.
���� ������� ������ �� ���������, ����� ������� ����������, ��������������� ���� ��������.
����� ������������ ���������� ���� java ��� ������� ����. ���������� ������ ���� ��������� ����������, ������������ �������� ��������� � �����������, ��� ������ �������.
���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������, � ���� � ���� ������ ������ ���������� ���������� ������, ����
<�������><���><��������><���� ��������> <����� ��������><���>
������������ ������ ���������� � ���� � ��� �� ����, � ��������� ������.
�� �������� ������� ���������� � ������.
��� ������������� �������� � �������-������� � ����, ���������� ������ ���� ��������� ����������, ������������ ������ ������� ��������� ������.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) throws IOException {
        Date date = new Date();
        String textFio = info("����������, �������� �������_���_�������� ����� ������!!!");
        if (!textFio.matches("(.*\\D)?\\s(.*\\D)?\\s(.*\\D)")) {
            throw new RuntimeException("������� ��� �� �� ������� ��� ���� �����");
        }
        String textDateOfBirth = info("������� ���� ���� �������� (������: 15.15.2001)");
        if (!textDateOfBirth.matches("(0\\d|[12]\\d|3[01])?[.](0\\d|1\\d)?[.](19|20)\\d{2}")) {
            throw new RuntimeException("������� ������� ���� ������ ���� ��������!");
        }
        String textMobile = info("������� ��� ����� ���������� ��������");
        if (!textMobile.matches("(^(7)?\\d{3})\\d{7}$")) {
            throw new RuntimeException(("�������� ����� �������� �� �� �������"));
        }
        String textGender = info("������� ��� ���: m (���� �������), f (���� �������)");
        if (!textGender.matches("f|m")) {
            throw new RuntimeException("������� f ��� m!!!");
        }
        String textFinal = "������ ������������: " + "\n" + date + "\n" + textFio + " " + textDateOfBirth + " " + textMobile + " " + textGender + "\n";
        String[] textFioSplit = textFio.split(" ");
        String surname = textFioSplit[0];

        try (FileWriter fw = new FileWriter(surname + ".txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textFinal);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static String info(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
