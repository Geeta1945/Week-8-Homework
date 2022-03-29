package Pool_20;

// child class of parent class Rectangle
public class Cuboid extends Rectangle{
    double height;
    public Cuboid(double width,double height,double length){
        if (height<0){ // checking value of height and initializing all values

            this.height = 0;
            this.length=length;
            this.width= width;
        }
        else
        {
            this.height = height;
            this.length=length;
            this.width= width;
        }
    }


    //Instance method - 1 without parameters and double return type

    public double getHeight(){

        return height;
    }
    //Instance method - 2 without parameters and double return type

    public double getVolume(){
        double volume; // calculating volume and also returning it.

        volume=getArea()*height; // called method of

        return volume;
    }


}
