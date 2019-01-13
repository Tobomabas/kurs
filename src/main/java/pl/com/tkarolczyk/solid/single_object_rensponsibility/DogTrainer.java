package pl.com.tkarolczyk.solid.single_object_rensponsibility;

public class DogTrainer {


    private String name;


    @Override
    public String toString() {
        return "DogTrainer{" +
                "name='" + name + '\'' +
                '}';
    }

    public DogTrainer(String name) {
        this.name = name;
    }


    public void trainDog(Dog dog){
        System.out.println(String.format("Dog [%s] is trained by [%s]",
                dog.getName(), name));
    }
    public void goForWalk (Dog dog){
        System.out.println(String.format("Dog [%s] is walking with [%s]",
                dog.getName(), name));
    }
    public void firstAid(Dog dog){
        System.out.println(String.format("Dog [%s] is healed by [%s]",
                dog.getName(), name));
    }
    public void feedinDog(Dog dog){
        System.out.println(String.format("Dog [%s] is feeding by [%s]",
                dog.getName(), name));
    }






}
