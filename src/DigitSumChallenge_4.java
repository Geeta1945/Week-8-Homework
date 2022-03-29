
import java.util.Scanner;

public class DigitSumChallenge_4 {
    // Program to print out sum for entered no

    public static void main(String[] args) {
        int n;

        Scanner s = new Scanner(System.in);// creating object for Scanner class to access different methods

        System.out.println("Enter no:");//allowing user to enter the no


        n = s.nextInt();// saving entered no into int n.
        sumDigits(n);// calling static method and passing the parameter - which received by user

    }

    public static int sumDigits(int no) {

        int sum = 0; //initialising sum =0;
        if (no > 10) { // checking condition that entered no is greater than 10 or not

            while (no != 0) { // this loop will run untill no is not equal to 0
                sum = sum + no % 10; // adding each reminder to sum : if entered no is 125 - very first time
                // when it entered the loop sum =0+5=5
                no = no / 10; // in first time loop we are changing/reassigning value for no with calculation.
                //here in first loop no will be 12
            }// exit the loop when no is equal to 0.
            System.out.println(sum);
            return sum;
        } else {
            System.out.println("Invalid number has been entered");
            return -1;
        }


    }

}


