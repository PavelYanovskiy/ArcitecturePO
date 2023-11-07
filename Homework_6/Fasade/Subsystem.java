package Homework_6.Fasade;

// Подсистема 1
class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem 1 operation");
    }
}

// Подсистема 2
class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem 2 operation");
    }
}

// Фасад
class Facade {
    private final Subsystem1 subsystem1;
    private final Subsystem2 subsystem2;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }
}


