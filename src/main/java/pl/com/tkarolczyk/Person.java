package pl.com.tkarolczyk;

public class Person {


    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        setName(name);
        this.surname = surname;
        setAge(age);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
            if (name.length() > 20){
                this.name = name.substring(0, 20);
                return;
            }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Person Tomasz = new Person("TomaszTomaszTomaszTomasz", "Karolczyk", -15);

        System.out.println(Tomasz);

    }

}
