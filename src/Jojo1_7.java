public class Jojo1_7 {
    public static int Factorial(int a) {
        int fact = 1;
        if (a>0) {
            for (int i = 1; i < a+1; i++) {
                fact = fact * i;
            }
            return fact;
        }
        if  (a==0) {
            return 1;
        }
        return -1;
    }
}
