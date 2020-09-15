import Module12.Students;
import static Module12.Students.*;

public class Java {
    public static void main(String[] args) {
        Students IgorSH = new Students("Igor","Shaplov",48);
        System.out.println("Введена запись: " + IgorSH.name + " " + IgorSH.surname + " " + IgorSH.age + " " +
                IgorSH.experienced + " " + IgorSH.learningObjective + " " + IgorSH.group);
        Students.taskExecution(IgorSH.name + " " + IgorSH.surname, 1);
        Students.taskExecution(IgorSH.name+" "+IgorSH.surname, 2);
        Students.taskExecution(IgorSH.name+" "+IgorSH.surname, 3);
        Students.moduleExecution(IgorSH.name+" "+IgorSH.surname, 1);
        Students.moduleExecution(IgorSH.name+" "+IgorSH.surname, 2);
        Students.moduleExecution(IgorSH.name+" "+IgorSH.surname, 3);
        Students.moduleExecution(IgorSH.name+" "+IgorSH.surname, 4);
    }
}
