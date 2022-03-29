import java.util.Scanner;

public class Program_5 {

    // Java program to check if the number is palindrome or not.
    // A number is called palindrome if the number and its reverse is same number
    public static boolean isPalindrome(int number) {//123 number received as parameter
        int reverse = 0, lastDigit, temp = number;

        while (number != 0 || number < 0) {
            lastDigit = number % 10;// last digit will be 3 first time
            reverse = reverse * 10 + lastDigit;
            //reverse will be 3 as well
            number = number / 10;
            // first time value will be 12
        }


        if (reverse > 0 && reverse == temp) { // checking that reversed number is equal to entered number and also not negative
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;

        System.out.print("Enter number : "); // allowing user to enter no
        i = s.nextInt();
        System.out.println(isPalindrome(i));

    }

}
