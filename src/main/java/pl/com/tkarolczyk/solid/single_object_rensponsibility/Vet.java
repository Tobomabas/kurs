package pl.com.tkarolczyk.solid.single_object_rensponsibility;

public class Vet {

    public void firstAid(Dog dog){
        System.out.println(String.format("Dog [%s] is healed by !!VET!!",
                dog.getName()));
    }
}
