package pl.com.tkarolczyk;

public class Persons {

    private String Name;
    private String Surname;
    private int age;

    public Persons(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        this.age = age;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
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
        this.age = age;
    }
    public int nameLength(){
        return getName().length();
    }


    @Override
    public String toString() {
        return "Persons{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Persons Tomek = new Persons("Tomasz", "Karolczyk", 22);

        System.out.println("Imię " + Tomek.getName() + " Nazwisko " + Tomek.getSurname() + " Wiek:" + Tomek.getAge());
        System.out.println(Tomek.nameLength());
        if (Tomek.nameLength() < 6) {
            System.out.println("napis Tomasz ma mniej niz" + Tomek.nameLength() + "liter");
        }
            else {
            System.out.println("Tomasz ma wiecej lub" + Tomek.nameLength() + "liter");

            }

    }

}
