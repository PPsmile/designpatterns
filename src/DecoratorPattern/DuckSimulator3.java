package DecoratorPattern;

public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 simulator = new DuckSimulator3();

        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        System.out.println("\nDuck Simulator with QuackCounter by QuackEcho");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuack() +  " times");

        //////////////////////////////
        // QuackEcho by QuackCounter
        //////////////////////////////
        Quackable mallardDuck2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck2 = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall2 = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck2 = new QuackEcho(new QuackCounter(new RubberDuck()));
        Quackable gooseDuck2 = new GooseAdaptor(new Goose());

        System.out.println("\nDuck Simulator with QuackEcho by QuackCounter");
        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(duckCall2);
        simulate(rubberDuck2);
        simulate(gooseDuck2);

        System.out.println("The ducks quacked " +
                QuackCounter.getNumberOfQuack() +  " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}

