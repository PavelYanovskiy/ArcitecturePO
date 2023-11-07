package Homework_2.Prototype;

public abstract class Prototype implements Cloneable {
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}

