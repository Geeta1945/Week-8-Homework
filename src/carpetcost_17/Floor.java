package carpetcost_17;
// Floor is parent class
public class Floor {
    double width,length;
    // constructor created with 2 parameter
    public Floor(){}
    public  Floor(double width,double length)
    {
        if (width<0){
          this.width=0;
          }
        if(length<0){
            length=0;
        }
        this.width=width;
        this.length=length;
    }
    public static void main(String[] args) {

        Floor callConstructor =new Floor(15,10);
    }
    public double getArea(){
        double area;
        area=width*length;
        return area;
    }
}
