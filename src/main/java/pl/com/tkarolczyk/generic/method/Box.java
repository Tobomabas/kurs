package pl.com.tkarolczyk.generic.method;

import pl.com.tkarolczyk.animal.Dog;

public class Box {
    private String string;
    private Object object;
    private Integer integer;
    private Double adouble;

    public Box(String s, Object object, Integer integer, Double adouble) {
        this.string = validator(string);
        this.object = validator(object);
        this.integer = validator(integer);
        this.adouble = validator(adouble);
    }

    public String getString() {
        return validator(string);
    }

    public void setSstring(String string) {
        this.string = string;
    }

    public Object getObject() {
        return validator(object);
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getInteger() {
        return validator(integer);
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getAdouble() {
        return validator(adouble);
    }

    public void setAdouble(Double adouble) {
        this.adouble = adouble;
    }

    @Override
    public String toString() {
        return "Box{" +
                "s='" + string + '\'' +
                ", object=" + object +
                ", integer=" + integer +
                ", adouble=" + adouble +
                '}';
    }

    public static String stringValidator (String string){
        if (null == string){
            throw new IllegalArgumentException("Cannot be Null");

        }
        return string;
    }
    public static <T> T validator (T value){
        if (null == value){
            throw new IllegalArgumentException("Cannot be Null");

        }
        return value;
    }


//
//
//
//    public static Object objectValidator (Object object){
//        if (null == object){
//            throw new IllegalArgumentException("Cannot be Null");
//
//        }
//        return object;
//    }
//    public static Integer integerValidator (Integer integer){
//        if (null == integer){
//            throw new IllegalArgumentException("Cannot be Null");
//
//        }
//        return integer;
//    }
//    public static Double doubleValidator (Double aDouble){
//        if (null == aDouble){
//            throw new IllegalArgumentException("Cannot be Null");
//
//        }
//        return aDouble;
//    }
//

}
