package Module12;

public class Students {

    public String Name;
    public String family;
    public int old;
    public int experience;
    public String learning_objective;
    public int group_number;
    public int number_of_completed_tasks;
    public int number_of_completed_modules;
    private static int taskCount;
    private static int moduleCount;
    private static final int MAX_MODULE = 3;

    public Students(String Name, String family, int old) {
        this(Name, family, old,0,"Learning Java",0,
                0,0);
    }

    public Students(String Name, String family, int old, int experience,
                   String learning_objective, int group_number,
                   int number_of_completed_tasks, int number_of_completed_modules) {
        this.Name = Name;
        this.family = family;
        this.old = old;
        this.experience = experience;
        this.learning_objective = learning_objective;
        this.group_number = group_number;
        this.number_of_completed_tasks = number_of_completed_tasks;
        this.number_of_completed_modules = number_of_completed_modules;
    }

    public static void task_execution(String student, int task) {
        taskCount++;
        System.out.println(student + " выполнил задачу № " + task + ". Всего выполнил задач: " + taskCount);
    }

    public static void module_execution(String student, int module) {
        if( moduleCount < MAX_MODULE) {
            moduleCount++;
            System.out.println(student + " выполнил модуль № " + module + ". Всего выполнил модулей: " + moduleCount);
        }
        else {
            System.out.println("Для " + student + " все модули уже пройдены.");
        }
    }

    public void carry_out_task() {

    }

    public void ask_a_question() {

    }

    public void pass_the_modele() {

    }

    public void communicate_eith_the_curator() {

    }
}
