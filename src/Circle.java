public class Circle {

    public Circle(double r) {
        this.r = r;
    }

    private double r;
    private static final double pi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double Area() {
        double area = pi*r*r;
        return area;
    }
    public double Length() {
        double len = 2*pi*r;
        return len;
    }

    public static double More_than_n_times(Circle cir1, Circle cir2) {
        return cir1.r/cir2.r;
    }
}
