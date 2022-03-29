package carpetcost_17;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);  // providing value to carpet constructor and setting up value for
        // per square meter


        Floor floor = new Floor(2.75, 4.0);
        // System.out.println(floor);// Constructor Floor of Floor class is assigning value of width and length
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet); // passing value of floor and carpet we have assigned in above two lines
                                                    //via two parameter constructor
        System.out.println("total= " + calculator.getTotalCost());// calling getTotalCost method of Calculator class with
                                                                 // object created with name - calculator

    }


}
