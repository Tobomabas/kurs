package pl.com.tkarolczyk.solid.interface_segregation;
public class RussianEngineWrapper implements RunEngine {

    RussianEngine russianEngine;

    public RussianEngineWrapper(RussianEngine russianEngine) {
        this.russianEngine = russianEngine;
    }

    @Override
    public void start() {
        russianEngine.davaj();
    }
    @Override
    public void stop() {
        russianEngine.davaj();
        russianEngine.davaj();

    }



}
