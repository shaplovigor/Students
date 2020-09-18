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

    public void getName() { System.out.println( this.name ); }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println( this.age );
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getSurname() { System.out.println( this.surname ); }

}
