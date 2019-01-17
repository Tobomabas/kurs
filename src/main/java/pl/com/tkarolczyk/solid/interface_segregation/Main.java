package pl.com.tkarolczyk.solid.interface_segregation;

public class Main {

    public static void main(String[] args) {
        WashMachine washMachineWithPolishEngine = new WashMachine(new PolishEngine(new Engine()));
        WashMachine washMachineWithChineaseEngine = new WashMachine(new ChineaseEngineWrapper(new ChineaseEngine()));
        WashMachine washMachineWithIndianEngine = new WashMachine(new IndianWrapper(new IndiaEngine()));
        WashMachine washMachineWithRussianEngine = new WashMachine(new RussianEngineWrapper(new RussianEngine()));


    }
}
