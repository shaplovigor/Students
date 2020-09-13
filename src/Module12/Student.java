package Module12;

public class Student {

    public String Name;
    public String family;
    public int old;
    public int experience;
    public String learning_objective;
    public int group_number;
    public int number_of_completed_tasks;
    public int number_of_completed_modules;

    public Student(String Name, String family, int old) {
        this(Name, family, old,0,"Learning Java",0,
                0,0);
    }

    public Student(String Name, String family, int old, int experience,
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

    public void carry_out_task() {

    }

    public void ask_a_question() {

    }

    public void pass_the_modele() {

    }

    public void communicate_eith_the_curator() {

    }
}
