package pl.com.tkarolczyk.animal;

public class NewDog extends Animal{

    AnimalStatus animalStatus;
    String name;

    public NewDog(String name, AnimalStatus animalStatus){
        this.name = name;
        this.animalStatus = animalStatus;

    }


    public AnimalStatus getAnimalStatus() {
        return animalStatus;
    }

    public void setAnimalStatus(AnimalStatus animalStatus) {
        this.animalStatus = animalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
