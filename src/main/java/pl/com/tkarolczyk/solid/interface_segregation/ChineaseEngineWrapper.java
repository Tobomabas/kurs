package pl.com.tkarolczyk.solid.interface_segregation;

public class ChineaseEngineWrapper implements RunEngine {

    ChineaseEngine chineaseEngine;

    public ChineaseEngineWrapper(ChineaseEngine chineaseEngine) {
        this.chineaseEngine = chineaseEngine;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
