package Homework_5.Calculator;

public class SumOperation {
    public SumOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double sum(){
        return firstArg + secondArg;
    }
}
