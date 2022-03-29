package carpetcost_17;
// Carpet is child class of Floor
public class Carpet extends Floor {
    double cost;
    public Carpet() {
    }
    public Carpet(double cost) {

        if (cost < 0) {
            this.cost = 0;
        }
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

}
