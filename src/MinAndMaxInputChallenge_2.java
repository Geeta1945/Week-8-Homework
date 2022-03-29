import java.util.Arrays;
import java.util.Scanner;

// allowing user to enter x numbers and return maximum and minimum number out of those numbers
public class MinAndMaxInputChallenge_2 {

    static int[] no;
    static int sum, i, max, n;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter maximum number you want to enter(less than 10) : "); // allowing user to enter total numbers would like to enter
        max = s.nextInt(); // storing the max number entered by user in max
        while (max > 10) // checking if max number entered is less than 10 if not then it will enter while loop and keep checking
        // util user enter less than 10 number
        {
            System.out.println("Please enter number less than equal to 10");
            System.out.println("Please enter maximum number you want to enter : ");
            max = s.nextInt();
        }

        calMinMax(); // calling method to allow user to enter number and save the numbers


    }

    // static method no return type and without any parameter
    public static void calMinMax() {
        Scanner s = new Scanner(System.in);

        no = new int[max]; // creating array with max number entered by user.
        i = 0;
        sum = 0;
        while (i < max) { // storing different index value in array

            n = i + 1;
            System.out.println("Please enter " + n + " number");
            no[i] = s.nextInt(); //storing numbers entered by user in array one by one
            i++;
        }


        Arrays.sort(no); // sorting the array created when user have entered all the numbers, so we can find out
        //  minimum and maximum number out of that
        System.out.println("Minimum " + no[0]);
        System.out.println("Maximum " + no[no.length - 1]);


    }


}



