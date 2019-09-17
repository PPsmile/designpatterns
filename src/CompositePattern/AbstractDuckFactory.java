package CompositePattern;

import AbstractFactoryPattern.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedhedDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
