import java.util.Scanner;

// program will provide only even digits sum and if number entered is negative than return -1
public class Program_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.print("Enter number : ");// allowing to enter number and storing it
        i = s.nextInt();
        System.out.println(getEvenDigitSum(i)); // calling the method and printing the output same time
    }


    public static int getEvenDigitSum(int number) {
        int sum = 0, remainder = 0, temp = number;
        System.out.println(number);

        while (number > 0) { // in this loop we are separating each digit and checking if it is even or odd

            remainder = number % 10;
            number = number / 10;

            if (remainder % 2 == 0) // if it is odd then only it will be added to sum variable
            {
                sum = sum + remainder;
            }
        }
        if (temp > 0) { // here we are checking that entered number is 0 or not and returning value accordingly

            return sum;
        } else {
            return -1;
        }

    }

}
