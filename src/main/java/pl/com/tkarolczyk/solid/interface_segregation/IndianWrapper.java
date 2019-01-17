package pl.com.tkarolczyk.solid.interface_segregation;

public class IndianWrapper implements RunEngine {
    IndiaEngine indiaEngine;

    public IndianWrapper(IndiaEngine indiaEngine) {
        this.indiaEngine = indiaEngine;
    }

    @Override
    public void start() {
        indiaEngine.h1();
        indiaEngine.h2();
    }

    @Override
    public void stop() {
        indiaEngine.h5();
        indiaEngine.h7();

    }
}
