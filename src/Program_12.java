import java.util.Scanner;
// Program check entered number is prime or not
public class Program_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        System.out.print("Enter number : "); // allowing user to enter the no
        input = s.nextInt(); // storing number entered by user into variable input
        Program_12 obj = new Program_12(); // creating object for instance method
        obj.isPrime(input); //calling instance method using object
    }


    public void isPrime(int number) {
        int remainder = 0;
        boolean result = false; // initialising result as false and will change to true only when

        for (int i = 2; i <= number; i++) { //changing i value untill we find out that it can't be divided by any other number than itself or 1

            remainder = number % i; // saving remainder dividing number entered with i value
            if (remainder == 0) {
                result = true; // condition become true as it is prime no
                break; // will break the loop once we find out that entered number can be divided by any other number than 1 or itself

            }
        }
        if (result) {

            System.out.println("not a prime no");
        } else {
            System.out.println("it is prime no");

        }


    }


}



