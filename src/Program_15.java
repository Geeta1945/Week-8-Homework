import java.util.Scanner;
// printing
public class Program_15 {


    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       int i;

        System.out.print("Enter number: "); // allowing user to enter the no and showing triangle accordingly
        i=s.nextInt();
        rightAngleTriangle(i); // calling static method and passing no entered by user to access in the method for more calculation
    }


    public static void rightAngleTriangle(int no){

        for(int j=1;j <= no;j++){
            for(int i=1;i <= no-j;i++){
                System.out.print("  ");
            }

            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();
        }



    }

}
