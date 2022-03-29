import java.util.Scanner;

public class Program_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;

        System.out.print("Enter number : ");
        i = s.nextInt();
        System.out.println(sumFirstAndLastDigit(i));
    }

    public static int sumFirstAndLastDigit(int number) {

        int count = 0, lastDigit, firstDigit, sum, original = number, divisor;// number received in parameter has been assigned to original number.

        // counting digits of the number

        if (number == 0) {

            sum = 0;
            return 0;
        }

        while (number != 0) {
            count++;
            number = number / 10;

        }
        // System.out.println(count);
        lastDigit = original % 10;// finding last digit of number received in parameter

        divisor = (int) Math.pow(10, count - 1);//here we are finding divisor - a number by which another number is to be divided
        //Math.pow() method used to multiply 10 by itself -number we will get it in count -1
        //System.out.println(divisor);

        firstDigit = original / divisor;
        //System.out.println(firstDigit);
        sum = firstDigit + lastDigit;


        if (sum >= 0) {
            return sum;
        } else {
            return -1;

        }
    }


}
