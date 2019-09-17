package AbstractFactoryPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckFactoryCounter = new DuckFactoryCounter();
        AbstractDuckFactory duckFactoryCounterEcho = new DuckFactoryCounterEcho();

        simulator.simulate(duckFactory);
        simulator.simulate(duckFactoryCounter);
        simulator.simulate(duckFactoryCounterEcho);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedhedDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        System.out.print("\nDuck Simulator : ");
        if (duckFactory instanceof DuckFactory)
            System.out.println("No Decorator");
        else if (duckFactory instanceof DuckFactoryCounter)
            System.out.println("QuackCounter");
        else if (duckFactory instanceof DuckFactoryCounterEcho)
            System.out.println("QuackCounter by QuackEcho");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuack() +  " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
