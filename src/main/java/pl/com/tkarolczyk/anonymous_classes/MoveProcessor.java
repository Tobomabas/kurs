package pl.com.tkarolczyk.anonymous_classes;

public class MoveProcessor {

    public void processMove(Moveable move){

        move.run();
        move.fly();
    }
}
