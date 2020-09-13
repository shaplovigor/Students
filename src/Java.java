import Module12.Student;

public class Java {
    public static void main(String[] args) {
        Student IgorSH = new Student("Igor","Shaplov",48);
        System.out.println("Введена запись: " + IgorSH.Name + " " + IgorSH.family + " " + IgorSH.old + " " +
                IgorSH.experience + " " + IgorSH.learning_objective + " " + IgorSH.group_number + " " +
                IgorSH.number_of_completed_modules + " " + IgorSH.number_of_completed_tasks);
    }
}
