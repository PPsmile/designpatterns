package DecoratorPattern;

public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 simulator = new DuckSimulator2();

        simulator.simulate();
    }

    void simulate() {

        Quackable mallardDuck = new QuackEcho(new MallardDuck());
        Quackable redheadDuck = new QuackEcho(new RedheadDuck());
        Quackable duckCall = new QuackEcho(new DuckCall());
        Quackable rubberDuck = new QuackEcho(new RubberDuck());
        Quackable gooseDuck = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        System.out.println("\nDuck Simulator with QuackEcho");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
