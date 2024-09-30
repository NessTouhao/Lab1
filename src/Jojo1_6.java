public class Jojo1_6 {
    public static double[] Garmonic(int a) {
        double[] numbers = new double [a];
        for (int i = 1; i < a; i++) {
            numbers[i-1] = 1.0/i;
        }
        return numbers;
    }
}