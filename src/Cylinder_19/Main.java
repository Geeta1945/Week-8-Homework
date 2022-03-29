package Cylinder_19;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);// circle object created to access all methods of the class
                                                // Circle constructor providing value of radius
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25); // cylinder object created to access all methods of the class
                                                                // Cylinder constructor providing value of radius and height
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
