package pl.com.tkarolczyk.access;

public class Person {

    private String Surname;
    private int age;
    private String name;
    String secret;
    protected String secondSecret;


    public Person(String name, String surname, int age) {
        this.name = name;
        Surname = surname;
        setAge(age);

    }
    public  Person(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!checkAge(age)) {
            this.age = 0;
            return;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean checkAge(int age) {

        if (age < 0) {
            return false;
        } else {
            return true;

        }
    }
}
