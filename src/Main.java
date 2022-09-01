public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 91.5; // вес в кг.
        double growth = 1.81; // рост в метрах
        double bMi = service.calculate(weight, growth);
        System.out.println(bMi);
    }
}
