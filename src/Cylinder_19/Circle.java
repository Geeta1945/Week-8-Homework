package Cylinder_19;

public class Circle {
    double radius;
// parent class
    public Circle(){}
    public Circle(double radius){

       this.radius=radius;
        if(radius<=0){  // checking the input- radius is 0 then setting value of radius to 0.
           this.radius=0;
        }
        else{

            this.radius=radius; //if radius is not 0 then we want to initialize field with value provided in constructor parameter

        }

    }

    // no parameter - double return type instance method created to return radius
    public double getRadius(){

       return radius;
    }
// no parameter ,double return type method created to return area calculated within the method
    public double getArea() {
        double area;
        getRadius(); // calling function to get radius
        area=(radius*radius*Math.PI);

        return area; // returning calculated area

    }

}
