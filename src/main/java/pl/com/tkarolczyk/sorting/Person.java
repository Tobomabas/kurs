package pl.com.tkarolczyk.sorting;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int age;
    private int iq;
    private double income;
    private double height;
    private double shoeSize;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", income=" + income +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                '}';
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Person(String name, String surname, int age, int iq, double income, double height, double shoeSize) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.income = income;
        this.height = height;
        this.shoeSize = shoeSize;
    }

    @Override
    public int compareTo(@NotNull Person o) {

        return o.iq - iq;

    }
}
