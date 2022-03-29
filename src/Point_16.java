public class Point_16 {

    int x, y;

    //constructor 1
    public Point_16() {

    }

    //constructor 2
    public Point_16(int x, int y) {

        this.x = x;
        this.y = y;
    }
    //Method : 1

    public int getX() {

        return x;
    }

    //Method : 2
    public int getY() {

        return y;
    }

    //Method : 3
    public void setX(int x) {
        this.x = x;
    }

    //Method : 4
    public void setY(int y) {
        this.y = y;
    }

    //Method : 5
    public double distance() {
        double d;
        d = Math.sqrt((0 - this.getX()) * (0 - this.getX()) + ((0 - this.getY()) * (0 - this.getY())));

        return d;
    }
    //Method : 6
    public double distance(int x, int y) {

        double d = Math.sqrt((x - this.getX()) * (x - this.getX()) + ((y - this.getY()) * (y - this.getY())));

        return d;
    }

    //Method : 7
    public double distance(Point_16 second) {
        double d = 0;
        d=Math.sqrt((second.getX() - this.getX()) * (second.getX() - this.getX()) + ((second.getY() - this.getY()) * (second.getY() - this.getY())));

        return d;

    }


    public static void main(String[] args) {

        Point_16 first = new Point_16(6, 5);// first object created and providing value to constructor for x and y
        Point_16 second = new Point_16(3, 1);// second object created and providing value to constructor for x and y
        System.out.println("distance(0,0)= " + first.distance()); // calling method using first object so whatever calculation we write inside
                                                                    // that method will execute and return distance

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_16 point = new Point_16();
        System.out.println("distance()= " + point.distance());


    }
}






