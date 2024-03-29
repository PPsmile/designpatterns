package CompositePattern;

import AbstractFactoryPattern.DuckCall;
import AbstractFactoryPattern.MallardDuck;
import AbstractFactoryPattern.Quackable;
import AbstractFactoryPattern.RedheadDuck;
import AbstractFactoryPattern.RubberDuck;
import AbstractFactoryPattern.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedhedDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
