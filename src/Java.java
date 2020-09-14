import Module12.Students;
import static Module12.Students.*;

public class Java {
    public static void main(String[] args) {
        Students IgorSH = new Students("Igor","Shaplov",48);
        System.out.println("Введена запись: " + IgorSH.Name + " " + IgorSH.family + " " + IgorSH.old + " " +
                IgorSH.experience + " " + IgorSH.learning_objective + " " + IgorSH.group_number + " " +
                IgorSH.number_of_completed_modules + " " + IgorSH.number_of_completed_tasks);
        Students.task_execution(IgorSH.Name+" "+IgorSH.family, 1);
        Students.task_execution(IgorSH.Name+" "+IgorSH.family, 2);
        Students.task_execution(IgorSH.Name+" "+IgorSH.family, 3);
        Students.module_execution(IgorSH.Name+" "+IgorSH.family, 1);
        Students.module_execution(IgorSH.Name+" "+IgorSH.family, 2);
        Students.module_execution(IgorSH.Name+" "+IgorSH.family, 3);
        Students.module_execution(IgorSH.Name+" "+IgorSH.family, 4);
    }
}
