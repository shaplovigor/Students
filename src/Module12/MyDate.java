package Module12;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyDate {

    public MyDate() throws ParseException {
// модуль 13 Библиотеки. Date ****************************************************************************************
        Date date = new Date(System.currentTimeMillis());
        Date date1 = new Date();
        System.out.println(date1);
// Введите с консоли дату. Сравните ее с текущей датой в системе. Выведите отличающиеся части (год, месяц) на экран.
        Scanner scanner = new Scanner(System.in);
        String date2 = scanner.nextLine();
// дальше не знаю как

// календарь на 25.12.2013
        Calendar calendar2 = new GregorianCalendar(2013, 11, 25);
        calendar2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
// 26.12.2013
        System.out.println("Календарь на 26.12.2013: " + calendar2.getTime());

        calendar2.add(Calendar.MONTH, -1);
        System.out.println("Календарь на 26.11.2013: " + calendar2.getTime());

        calendar2.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Календарь после roll: " + calendar2.getTime());

// Ddtlbnt 02/02/2020, c помощью методов add, roll получите дату на 8 марта 2001 года самым коротким путем.
        Calendar calendar3 = new GregorianCalendar(2020, 1, 2);
        System.out.println(calendar3.getTime());
        calendar2.add(Calendar.DAY_OF_YEAR, 35); //увеличиваем дату на 30 день
        calendar2.roll(Calendar.YEAR, -19);
        System.out.println(calendar2.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); // В этом формате будем вводить дату
        Date one = sdf.parse("27.07.2020 10:20:00"); // вводим дату используя метод parse форматера
        Date two = sdf.parse("26.07.2020 14:50:10");
        printDifference(one, two); // Результат не зависит от последовательности аргументов
        printDifference(two, one); // Печатается "Разница между датами: 0 дней 19 часов 29 минут 50 секунд."

// 13.2.3 приложение, которое выведет на экран дату в формате   12:20 15.01.2019.
        SimpleDateFormat format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        Date date4 = new Date();
// на экран
        System.out.println(format.format(date4));
// запись результата в файл
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            writer.write(format.format(date4));
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

// 13.2.4 количество дней от текущего дня до следующего вашего дня рождения
        Calendar currentDate = new GregorianCalendar();
        Calendar myHB = new GregorianCalendar(2021,6,28); // не забываем, что Июль это 6 !
        System.out.println(printDifferenceOfDay(currentDate.getTime(), myHB.getTime()));

        long diff = -1;
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        Date dateStart = format1.parse("28.07.2021");
        Date dateEnd = currentDate.getTime();
        try {
            diff = (long) (Math.abs(dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
        } catch (Exception e) {

        }

        System.out.println(" "+currentDate.getTime()+" "+myHB.getTime()+" "+dateStart+" "+dateEnd+" "+diff);
    }

    private static long printDifferenceOfDay(Date first, Date second) {
        long milliseconds = Math.abs(first.getTime() - second.getTime());
        long days = milliseconds / (24 * 60 * 60 * 1000);
        System.out.println(days);
        return days;
    }

    public static void printDifference(Date first, Date second) {
        long milliseconds = Math.abs(first.getTime() - second.getTime()); // Получаем разницу модулей в миллисекундах
        long days = milliseconds / (24 * 60 * 60 * 1000); // Получаем целое кол-во дней
        milliseconds -= days * (24 * 60 * 60 * 1000); // Онимает кол-во дней в миллисекундах
        long hours = milliseconds / (60 * 60 * 1000); // Получаем целое кол-во часов
        milliseconds -= hours * (60 * 60 * 1000); // Онимает кол-во часов в миллисекундах
        long minutes = milliseconds / (1000 * 60); // Получаем целое кол-во минут
        milliseconds -= minutes * (1000 * 60); // Онимает кол-во минут в миллисекундах
        long seconds = milliseconds / (1000); // Получаем целое кол-во секунд
        String format = "Разница между датами: %s дней %s часов %s минут %s секунд." + System.lineSeparator();
        System.out.printf(format, days, hours, minutes, seconds); // печатаем результат в указанном выше формате
    }
}
