import Module12.Students;
import static Module12.Students.*;

public class Java {
    public static void main(String[] args) {
        Students IgorSH = new Students("Igor","Shaplov",48);
        System.out.println("Введена запись: " + IgorSH.getName() + " " + IgorSH.getSurname() + " " + IgorSH.getAge() + " " +
                IgorSH.experienced + " " + IgorSH.learningObjective + " " + IgorSH.group);
        Students.taskExecution(IgorSH.getName() + " " + IgorSH.getSurname() , 1);
        Students.taskExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 2);
        Students.taskExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 3);
        Students.moduleExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 1);
        Students.moduleExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 2);
        Students.moduleExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 3);
        Students.moduleExecution(IgorSH.getName() +" "+IgorSH.getSurname() , 4);
    }
}
