package hw3;

/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
разделенные пробелом:
Фамилия Имя Отчество, дата рождения, номер телефона, пол
Форматы данных: фамилия, имя, отчество - строки
дата рождения - строка формата dd.mm.yyyy
номер телефона - целое беззнаковое число без форматирования. Например 71112223344
пол - символ латиницей f или m.
Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
 вернуть код ошибки, обработать его и показать пользователю сообщение,
 что он ввел меньше и больше данных, чем требуется.
Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
<Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
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
        String textFio = info("Пожалуйста, напишите ФАМИЛИЯ_ИМЯ_ОТЧЕСТВО через пробел!!!");
        if (!textFio.matches("(.*\\D)?\\s(.*\\D)?\\s(.*\\D)")) {
            throw new RuntimeException("ВВедено ФИО не по формату или есть цифры");
        }
        String textDateOfBirth = info("Введите свою дату рождения (пример: 15.15.2001)");
        if (!textDateOfBirth.matches("(0\\d|[12]\\d|3[01])?[.](0\\d|1\\d)?[.](19|20)\\d{2}")) {
            throw new RuntimeException("Неверно введена дата Вашего день рождения!");
        }
        String textMobile = info("Введите Ваш номер мобильного телефона");
        if (!textMobile.matches("(^(7)?\\d{3})\\d{7}$")) {
            throw new RuntimeException(("Написали номер телефона не по формату"));
        }
        String textGender = info("Введите Ваш пол: m (если мальчик), f (если девочка)");
        if (!textGender.matches("f|m")) {
            throw new RuntimeException("Введите f или m!!!");
        }
        String textFinal = "Данные пользователя: " + "\n" + date + "\n" + textFio + " " + textDateOfBirth + " " + textMobile + " " + textGender + "\n";
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
