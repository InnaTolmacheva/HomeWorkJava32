public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // тест 1
        int bodyMassIndexLow = service.calculate(55, 176);
        System.out.println("Индекс массы тела = " + bodyMassIndexLow);

        // тест 2
        int bodyMassIndexNormal = service.calculate(75, 176);
        System.out.println("Индекс массы тела = " + bodyMassIndexNormal);

        // тест 3
        int bodyMassIndexHigh = service.calculate(105, 156);
        System.out.println("Индекс массы тела = " + bodyMassIndexHigh);
    }
}
