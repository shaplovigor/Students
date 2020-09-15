package Module12;

public class Students extends Person {

    public String name;
    public String surname;
    public int age;
    public boolean experienced;
    public String learningObjective;
    public int group;
    private static int taskCount;
    private static int passedModuleCount;
    private static final int MAX_MODULE = 3;

    public Students(String name, String surname, int age) {
        this(name, surname, age,false,"Learning Java",0);
    }

    public Students(String name, String surname, int age, boolean experienced,
                   String learningObjective, int group) {
        super(name, surname, age);
        this.experienced = experienced;
        this.learningObjective = learningObjective;
        this.group = group;
    }

    public static void taskExecution(String student, int task) {
        taskCount++;
        System.out.println(student + " выполнил задачу № " + task + ". Всего выполнил задач: " + taskCount);
    }

    public static void moduleExecution(String student, int module) {
        if( passedModuleCount < MAX_MODULE) {
            passedModuleCount++;
            System.out.println(student + " выполнил модуль № " + module + ". Всего выполнил модулей: " + passedModuleCount);
        }
        else { System.out.println("Для " + student + " все модули уже пройдены."); }
    }

    public void carryOutTask() {  }

    public void askAquestion() {  }

    public void passTheModule() {  }

    public void communicateEithTheCurator() {  }

}