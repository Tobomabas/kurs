package pl.com.tkarolczyk.generic;
import pl.com.tkarolczyk.animal.Animal;
import pl.com.tkarolczyk.animal.Dog;

public class Home <E extends Animal> {

    private E someone;

    public void ebterHome (E someone){
        this.someone = someone;
        someone.wichAnimal();
    }
    public E goOutside(){
        return someone;

    }

}
