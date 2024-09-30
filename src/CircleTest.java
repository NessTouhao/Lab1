public class CircleTest {
    public static void main(String[] args) {
        Circle cir1 = new Circle(5);
        Circle cir2 = new Circle(6);
        System.out.println(cir1.getR());
        System.out.println(cir2.getR());
        cir1.setR(6);
        cir2.setR(8);
        System.out.println(cir1.getR());
        System.out.println(cir2.getR());
        System.out.println(cir1.Area());
        System.out.println(cir2.Area());
        System.out.println(cir1.Length());
        System.out.println(cir2.Length());
        System.out.println(Circle.More_than_n_times(cir1,cir2));
    }
}