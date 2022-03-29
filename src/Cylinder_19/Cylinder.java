package Cylinder_19;
// child class of parent class Circle
public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {

        if (height < 0) { // checking if height is less than 0 then height =0 need to assign.

            this.height = 0;
            this.radius = radius;
        } else {
            this.height = height; // if height is not equal to 0 then
            this.radius = radius;
        }
    }

    public double getHeight() {


        return height; // returns height
    }

    public double getVolume() { // calculating volume of Cylinder
        double volume;
        volume = getHeight() * getArea(); // method get area called from parent class Circle
                                        //  child class inherit properties of parent class
        //System.out.println(volume);
        return volume;
    }

}
