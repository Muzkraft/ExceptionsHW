package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW3 {

/*Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
Фамилия Имя Отчество номертелефона

Форматы данных:
фамилия, имя, отчество - строки
номертелефона - целое беззнаковое число без форматирования

Ввод всех элементов через пробел

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки,
обработать его и показать пользователю сообщение, что он ввел меньше или больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение,
соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои.
Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
в него в одну строку должны записаться полученные данные, вида
<Фамилия><Имя><Отчество><номер_телефона>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
пользователь должен увидеть стектрейс ошибки.*/

    public static void input() throws ArrayIndexOutOfBoundsException {
        System.out.println("Введите фамилию, имя, отчество, номер телефона (число без разделителей) разделенные пробелом:");
        Scanner sc = new Scanner(System.in);
        String[] fio = sc.nextLine().split(" ");

        try {
            if (fio.length != 4) throw new ArrayIndexOutOfBoundsException();
            if(fio[0] == null || fio[0].matches("^[0-9+_.-//]")) throw new InputMismatchException();
            
            String surname = fio[0];
            String name = fio[1];
            String patronymic = fio[2];
            String phone = fio[3];
            if (!phone.matches("\\d+")) throw new NumberFormatException() ;

            System.out.printf("Фамилия: %s, Имя: %s, Отчество: %s, Номер телефона: %s", surname, name, patronymic, phone);
            System.out.println();
            toFile(fio);

        } catch (ArrayIndexOutOfBoundsException e1) {
            if (fio.length < 4) System.out.println("Вы ввели меньше данных, чем требуется!");
            if (fio.length > 4) System.out.println("Вы ввели больше данных, чем требуется!");
        } catch (InputMismatchException e2) {
            System.out.println("Не бывает таких фамилий!");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат телефона");
        }
    }

    public static void toFile(String[] fio) throws InputMismatchException {
        String fileName = fio[0].toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            if(fio[0] == null || fio[0].matches("^[0-9+_.-]")) throw new InputMismatchException();
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            for (String s : fio) {
                fileWriter.write(s + " ");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Недопустимые символы в имени файла!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
