import java.util.Scanner;

// false criteria doesn't work -- check that one out
public class ReadingUserInputChallenge_1 {

    public static void main(String[] args) {

        ReadingUserInputChallenge_1 obj = new ReadingUserInputChallenge_1();
        obj.getInt();
    }

    // instance method created to allow user to input 10 numbers and find out that is it a integer or not
    public void getInt() {
        int count = 1, sum = 0, no;
        Scanner s = new Scanner(System.in);
        boolean isInt;

        while (count <= 10) {

            System.out.println("Enter Number " + count + " : ");
            isInt = s.hasNextInt(); // checking entered number is integer or not and save true or false result
            if (isInt) { // if result is truer than only below steps will be executed

                no = s.nextInt(); // saving entered number into the no variable
                sum = sum + no; // adding no to sum variable
                count++;
            } else {
                System.out.println("Invalid Number"); // if entered number is not integer than this message will be displayed
            }
            s.nextLine(); // taking it to next line
        }
        System.out.println("Sum of all numbers = " + sum);
        s.close(); // scanner closed
    }
}



