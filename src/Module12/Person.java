package Module12;

abstract class Person {
    public String name;
    public String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {  }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name ; }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() { return this.age ; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() { return this.surname ; }

}
