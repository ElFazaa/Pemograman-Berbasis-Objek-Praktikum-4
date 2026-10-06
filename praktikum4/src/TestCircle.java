public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0, "blue", true);
        c3.setRadius(4.0);
        c3.setColor("yellow");

        System.out.println("c1 radius: " + c1.getRadius() + ", area: " + c1.getArea() + ", obj: " + c1);
        System.out.println("c2 radius: " + c2.getRadius() + ", area: " + c2.getArea() + ", obj: " + c2);
        System.out.println("c3 setelah setter: " + c3);
        
    }
}
