package pl.com.tkarolczyk.exception;

public class Person2 {
    private String name;
    private String surname;
    private int age;

    public Person2(String name, String surname, int age) throws WrongParameter {
        if (name == null || "".equals(name))

            throw new WrongParameter("Wrong name ! " + name);

        else
            this.name = name;
        if (surname == null || "".equals(surname))

            throw new WrongParameter("Wrong surname ! " + surname);


        else
            this.surname = surname;
        if (age <= 0)

            throw new WrongParameter("Wrong age ! " + age);


        else
        this.age = age;

    }

    public static void main(String[] args) {

        try {
            Person2 tomek = new Person2("tomek", "Karolczyk", 33);
        } catch (WrongParameter wrongParameter) {
            wrongParameter.printStackTrace();
        }
        Person2 wrongTomek = null;
        try {
            wrongTomek = new Person2("", "ss", 22);
        } catch (WrongParameter wrongParameter) {
            wrongParameter.printStackTrace();
        }

        System.out.println(wrongTomek.age);

    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


}
