import java.util.Scanner;
//printing diamond
public class Diamond_14 { //instance method created to execute the logic/print diamond
    static int r;
    public void diamond() {
        int m = 1;
        int n;
        while (m <= r) { // r is storing value entered by user to produce diamond shape accordingly r=5
            n = 1;
            while (n++ <= r - m) { // creating /printing /leaving space before printing *
                // it will keep printing space untill condition is false
                System.out.print(" ");
            }
            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println(); // taking cursor to next line so again while loop for creating space will executed
            m++;
        }
        m = r - 1;
        while (m > 0) {
            n = 1;
            while (n++ <= r - m) {
                System.out.print(" ");
            }
            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
          m--;
        }
    }


    public static void main(String[] args) {
        System.out.println("input no of rows(half of diamond) : ");
        Scanner s = new Scanner(System.in);//allowing user to enter raws of diamond
        r = s.nextInt();

        Diamond_14 obj = new Diamond_14();//object created to call instance method
        obj.diamond();

    }


}
