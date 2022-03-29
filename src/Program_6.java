import java.util.Scanner;

public class Program_6 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Program_6 obj = new Program_6();
        int i;

        System.out.print("Enter number of rows: "); // allowing user to enter no
        i=s.nextInt();
        obj.printNo(i);



    }

    //instance method has been created to print numbers
    public void printNo(int j){ // j is number entered by user which will be used in method logic
        int m,k;

        for(m=1;m<=j;m++){ // once inner loop come out than it will increase value of m by 1 and inner loop executed
                            // process will be iterative untill condition became false

            for(k=1;k<=m;k++) { // this loop will be executed untill the k's value will be same as m or less than that
                                // otherwise it will come out of the loop and outer loop will be executed until it's condition became false

                System.out.print(k);


            }
            System.out.println("");// this statement will allow print number on next line after coming out of the above loop


        }



    }

}
