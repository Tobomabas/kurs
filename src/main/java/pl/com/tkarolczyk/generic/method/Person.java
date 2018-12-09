package pl.com.tkarolczyk.generic.method;

public class Person {
    private String name;
    private String surname;
    private Integer age;


    public Person(String name, String surname, Integer age) {
       validator(name, surname, age);
//       validator(name, age, age);

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private static <T,U> void validator (T value, T value2, U value3){
        if (null == value){
            throw new IllegalArgumentException("Cannot be Null");

        }
        if (null == value2){
            throw new IllegalArgumentException("Cannot be Null");

        }
        if (null == value3){
            throw new IllegalArgumentException("Cannot be Null");

        }

    }
}




