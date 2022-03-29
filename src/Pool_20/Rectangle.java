package Pool_20;
// parent class of Cuboid
public class Rectangle {
    double width,length;

    public Rectangle(){}

    public Rectangle(double width,double length){

        if (width<0){

            this.width=0;
            this.length=length;
        }
        else
        {
            this.width=width;
            this.length=length;
        }

    }

    // instance method 1 - with double return type - no parameters

    public double getWidth(){

        return width;
    }
    // instance method 2 - with double return type - no parameters

    public double getLength(){

        return length;
    }
    // instance method 3 - with double return type - no parameters

    public double getArea(){

        double area; // calculating area and returning
        area=width*length;

        return area;
    }


}
