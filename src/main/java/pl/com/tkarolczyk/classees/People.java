package pl.com.tkarolczyk.classees;

public class People {

    private String name;
    private String surname;
    private int age;
    private String skinColour;

    public People(String name, String surname, int age, String skinColour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.skinColour = skinColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", skinColour='" + skinColour + '\'' +
                '}';
    }
    public static void main(String[] args) {

        People Tomek = new People("Tomasz", "Karolczyk", 23, "biały");

        System.out.println("Imie: " + Tomek.getName().toUpperCase());
        System.out.println("Nazwisko: " + Tomek.getSurname().toUpperCase());
        System.out.println("Wiek: " + Tomek.getAge());
        System.out.println("Kolor skóry: " + Tomek.getSkinColour().toUpperCase());

    }
}
