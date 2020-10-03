package Module12;

import java.io.*;

public class MyIO {
    public MyIO() throws IOException {
/*
// файлы
        File file = new File("src/Module12/MyIO.java");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(file.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
        System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println(file.isFile() ? "Файл." : "Не файл.");
        System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println("Дата последнего редактирования: " + file.lastModified());
        System.out.println("Размер: " + file.length() + " байт.");
*/
// каталоги
/*
        long length = 0;
        File files = new File("src/Module12");
        System.out.println(files.length()); // размер выдает неверно!!!
        File[] files1 = files.listFiles();
        int count = files1.length;
        for (int i = 0; i < count; i++) {
            if (files1[i].isFile()) {
                length += files1[i].length();
                System.out.println(files1[i].getName()+" "+files1[i].length()+" "+length);
            } else {
                length += files1[i].length();//getFolderSize(files1[i]);
                System.out.println(files1[i].getName()+" "+files1[i].length()+" "+length);
            }
        }
        System.out.println(length);
*/

/*
// потоки, побайтное копирование файла, выводит код/индекс символа (один или два байта)
// Для чтения байта или массива байтов используются абстрактные методы read() и read(byte[] b) класса InputStream.
// Метод возвращает –1, если достигнут конец потока данных, поэтому возвращаемое значение имеет тип int, не byte.
        File inFile = new File("notes3.txt"); //получаем информацию о файле
        File outFile = new File("notes4.txt"); //получаем информацию о файле
        FileInputStream inStream = null; //Создаем экземпляр класса FileInputStream
        try {
            inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        FileOutputStream outStream = null; //Создаем экземпляр класса FileOutputStream
        try {
            outStream = new FileOutputStream(outFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        int c;
        while (true) {
            try {
                if (!((c = inStream.read()) != -1)) break;
                    outStream.write(c);
        // выводит код считанного символа/байта
                    System.out.println(c);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        try {
            inStream.close(); // закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            outStream.close(); // закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

// чтобы ввести некое значение с клавиатуры, воспользовавшись потоками, нам необходимо реализовать следующее:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String title = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

/*
// тоже копирование файла, но здесь выводит значение символа
        File f = new File("notes4.txt"); // должен существовать!
        int b, count = 0;
        try {
            FileReader is = new FileReader(f);
//            FileInputStream is = new FileInputStream(f); // альтернативный вариант
            while ((b = is.read()) != -1) { // чтение
        // выводит значение символа
                System.out.println((char)b);
                count++;
            }
                is.close(); // закрытие потока ввода
            } catch (IOException e) {
                System.err.println("ошибка файла: " + e);
            }
            System.out.print("\n число байт = " + count);
*/

// вы можете выполнить чтение и запись с консолью, файлом, блоком памяти или через Интернет
/*

// подсчитывает количество слов в файле
        File f1 = new File("notes4.txt"); // должен существовать!
        int b1, count1 = 0, countWords = 0;
        try {
            FileReader is1 = new FileReader(f1);
//            FileInputStream is = new FileInputStream(f); // альтернативный вариант
            while ((b1 = is1.read()) != -1) { // чтение
                // выводит значение символа
                System.out.println((char)b1+" "+b1);
                count1++;
                if (b1 == 32 | count1 == f1.length()) {
                    countWords++;
                    //System.out.println(countWords+" "+(count1-1)+" "+f1.length());
                }
            }
            is1.close(); // закрытие потока ввода
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
        System.out.print("\n число байт = " + count1 + " число слов = " + countWords);

// подсчет слов от SF
        int count2 = 0;
        File file2 = new File("notes4.txt");
        try (FileInputStream fis = new FileInputStream(file2)) {
            byte[] bytesArray = new byte[(int) file2.length()];
            fis.read(bytesArray);
            String s = new String(bytesArray);
            String[] data = s.split(" ");
            for (int i = 0; i < data.length; i++) {
                count2++;
            }
            System.out.println("Number of characters in the given file are " + count2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/


// записывает в начало и конец файла

/*
        Для решения использовались только потоки BufferedWriter и BufferedReader, есть более подходящий для этой задачи поток — java.io.RandomAccessFile. Он позволяет, используя курсор, читать/писать в файл перемещаясь по нему.
                Подробнее можно прочитать здесь и здесь.
*/

        String firstLine = "Hello world!" + System.lineSeparator(); // разные строки для примера
        String lastLine = "An example of io operations on a file." + System.lineSeparator();
        File example = File.createTempFile("example", ".txt"); // временный файл для программы
        FileAppender appender = new FileAppender(example); // временный файл передаём через конструктор
        appender.addToEnd(lastLine); // проверяем что не важна последовательность вызовов
        appender.addToBegin(firstLine); // чередуем запись в начало и конец файла
        appender.addToEnd(lastLine);
        appender.addToBegin(firstLine);
        appender.printFile(); // печатаем результат

    }

        public class FileAppender {
            private final File file; // Файл для добавления будет неизменяемый
            private static final boolean APPEND = true; // Далее две константы чтобы в коде
            private static final boolean NOT_APPEND = false; // было ясно что это за булева значения
            public FileAppender(File file) { // Файл для добавления передаём через стандартный конструктор
                this.file = file; // инициализируем поле класса
                if (!file.canRead() || !file.canWrite()) { // Проверяем что файл можно читать и редактировать
                    String msg = "File cant read or written."; // дополнительное пояснение к исключению
                    throw new IllegalArgumentException(msg); // выбрасывается исключение
                }
            }
            public void addToBegin(String text) throws IOException {
                File temp = File.createTempFile("prerenderPrefix", ".txt"); // Временный файл для копирования
                this.copyFile(file, temp); // копируем оригинальный файл во временный
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, NOT_APPEND)); // запись в оригинал
                     BufferedReader reader = new BufferedReader(new FileReader(temp))) { // чтение из копии
                    writer.write(text); // поток имеет флаг NOT_APPEND, добавление строки перезапишет файл
                    while (reader.ready()) { // читаем строки из временного файла
                        writer.write(reader.readLine()); // пишем построчно в файл из временного файла
                        writer.newLine(); // нужен перенос
                    }
                    writer.flush(); // выгружаем содержимое буфера в файл
                }
            }
            public void addToEnd(String text) throws IOException {
                try (FileWriter writer = new FileWriter(file, APPEND); // поток для записи в файл
                     BufferedWriter bufferWriter = new BufferedWriter(writer)) { // оборачиваем в буферизованный поток
                    bufferWriter.write(text); // поток имеет флаг APPEND, строка добавится в конец
                    bufferWriter.flush(); // выгружаем содержимое буфера в файл
                }
            }
            public void printFile() throws IOException {
                try (FileReader reader = new FileReader(file); // поток для чтения файла
                     BufferedReader bufferedReader = new BufferedReader(reader)) { // оборачиваем в буферизованный поток
                    while (bufferedReader.ready()) { // читаем файл
                        System.out.println(bufferedReader.readLine()); // печатаем построчно
                    }
                }
            }
            private void copyFile(File original, File copied) throws IOException {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(copied, NOT_APPEND)); // запись в копию
                     BufferedReader reader = new BufferedReader(new FileReader(original))) { //чтение из оригинального файла
                    while (reader.ready()) { // читаем оригинал
                        writer.write(reader.readLine()); // пишем в копию
                        writer.newLine(); // нужен перенос
                    }
                    writer.flush(); // выгружаем содержимое буфера в файл
                }
            }
        }
}
