package carpetcost_17;
// child class of carpet
public class Calculator extends Carpet {
    Floor floor; // instance variables for class Floor and Carpet has been created
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) { //two parameter constructor setting value of floor and carpet

        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        double totalCost = 0;
        totalCost = carpet.getCost() * floor.getArea(); // providing value to both the methods via carpet and floor variables

        return totalCost;
    }
}
