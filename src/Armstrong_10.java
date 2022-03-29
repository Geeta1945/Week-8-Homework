import java.util.Scanner;

// program to check that entered number is armstrong number or not
// Armstrong number is a number for which the sum of the cubes of its digits is equal to the number itself
public class Armstrong_10 {
    static int no;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter one no : ");
        no = s.nextInt(); // storing entered no into the no variable
        Armstrong_10 obj = new Armstrong_10();
        obj.isArmstrongNo(no); // calling instance method with object and passing one parameter


    }

    public boolean isArmstrongNo(int no) {
        int t, digit = 0, last_no, sum = 0;
        t = no;
        while (t > 0) { // counting digit of entered number so can use in below while loop -math.pow
            t = t / 10;
            digit++;

        }

        t = no;
        // checking the condition that entered no and sum of every digit of the number is same or not
        while (t > 0) { //t will be 153
            last_no = t % 10; //153%10 = 3 is reminder and while loop will be keep going until t's value is greater than 0
            sum += (Math.pow(last_no, digit)); // here last no will be multiplied by itself , digit times(whatever digit number is there)
            t = t / 10; // changing t's value to get next digit

        }
        if (sum == no) {
            System.out.println("Entered no is armstrong no");

            return true; //return true if no entered and sum of all digits are same
        } else {

            System.out.println("Entered no is NOT armstrong no");
            return false;
        }
    }


}


