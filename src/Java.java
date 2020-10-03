import Module12.MyDate;
import Module12.MyNet;
import Module12.Students;
import Module12.MyIO;

import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java {
    public static void main(String[] args) throws ParseException {
/*
        Students IgorSH = new Students("Igor", "Shaplov", 48);
        System.out.println("Введена запись: " + IgorSH.getName() + " " + IgorSH.getSurname() + " " + IgorSH.getAge() + " " +
                IgorSH.experienced + " " + IgorSH.learningObjective + " " + IgorSH.group);
        Students.taskExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 1);
        Students.taskExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 2);
        Students.taskExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 3);
        Students.moduleExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 1);
        Students.moduleExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 2);
        Students.moduleExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 3);
        Students.moduleExecution(IgorSH.getName() + " " + IgorSH.getSurname(), 4);
*/
/*

// 12.*.* проверка корректности имени
        Pattern pattern = Pattern.compile("([А-Я][а-я]+(-[А-Я][а-я]+)*(\\s+|$)){3}");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Matcher matcher = pattern.matcher(name);
        if (((Matcher) matcher).matches()) {
            System.out.println("Имя корректно!");
        } else System.out.println("Имя некорректно!");
*/

/*
        try {
            new MyNet();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
*/
        try {
            new MyIO();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
