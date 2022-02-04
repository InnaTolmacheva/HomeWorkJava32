public class BmiService {
    public int calculate(int weight, int growth) {
        int growthSquare = growth * growth;
        int bodyMassIndex = weight * 10_000 / growthSquare;
        return bodyMassIndex;

    }
}
