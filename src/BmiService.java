public class BmiService {
    public double calculate (double weight, double growth) {
        double bMi = weight / (growth * growth);
        return bMi;
    }
}
