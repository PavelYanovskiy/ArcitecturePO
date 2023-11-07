package Homework_2.Decorator;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("BMW M5");
        TuningAuto AutoWrap = new TuningAuto(auto);

        System.out.println("Выводим характеристики стокового авто");
        printAutoSpecifications(auto);

        System.out.println();

        System.out.println("Выводим характеристики авто с тюнигом");
        printAutoSpecifications(AutoWrap);
    }

    private static void printAutoSpecifications(TuningAuto autoWrap) {
    }

    public static void printAutoSpecifications(Auto auto) {
        System.out.println(auto.getName());
        System.out.println("Мощность " + auto.getPower());
        System.out.println("Скорость " + auto.getSpeed());
    }
}
