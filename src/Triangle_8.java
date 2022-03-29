import java.util.Scanner;

public class Triangle_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Triangle_8 obj = new Triangle_8();
        int i;

        System.out.print("Enter number of rows: "); // allowing user to enter no
        i = s.nextInt(); // storing no
        obj.design(i); // calling instance method with object and one parameter provided


    }

    // instance method created with no return type and one parameter
    public void design(int i) {

        for (int j = 1; j <= i; j++) {//once come out of inner loop will change value of j and also checking condition
            // if condition is true loop will be executed again
            for (int k = 1; k <= j; k++) { // loop will be executed untill the condition became false
                System.out.print("@");

            }
            System.out.println(""); // after loop exit it will take cursor to next line
        }

    }


}
