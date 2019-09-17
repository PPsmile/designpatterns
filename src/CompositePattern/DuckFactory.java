package CompositePattern;

import AbstractFactoryPattern.AbstractDuckFactory;
import AbstractFactoryPattern.DuckCall;
import AbstractFactoryPattern.MallardDuck;
import AbstractFactoryPattern.Quackable;
import AbstractFactoryPattern.RedheadDuck;
import AbstractFactoryPattern.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedhedDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
