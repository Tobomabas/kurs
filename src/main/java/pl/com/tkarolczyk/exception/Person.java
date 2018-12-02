package pl.com.tkarolczyk.exception;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) throws IllegalArgumentException {
        if (name == null || "".equals(name))

            throw new IllegalArgumentException("Wrong name ! " + name);

        else
            this.name = name;
        if (surname == null || "".equals(surname))

            throw new IllegalArgumentException("Wrong surname ! " + surname);


        else
            this.surname = surname;
        if (age <= 0)

            throw new IllegalArgumentException("Wrong age ! " + age);


        else
        this.age = age;

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        try {
            Person tomek = new Person("tomek", "Karolczyk", 33);
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        Person wrongTomek = null;
//        try {
            wrongTomek = new Person("", "ss", -22);
//        } catch (IllegalArgumentException illegalArgumentException) {
//            illegalArgumentException.printStackTrace();
//        }

        System.out.println(wrongTomek.age);

    }




}
