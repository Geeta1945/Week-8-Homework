public class Fibonacci_9 {
    // program about printing first 10 fibonacci numbers
    public void calculate() {

        int no_1 = 0, no_2 = 1, no_3, k, count = 10;
        System.out.print(no_1 + " " + no_2);//printing 0 and 1

        for (k = 1; k < count; k++) { // this condition will check if k is less than 10 then will go in loop and will continue until became false
            no_3 = no_1 + no_2; // adding first two fibonacci number to create third one and so on
            System.out.print(" " + no_3);
            no_1 = no_2; // assigning value of no2 to no1
            no_2 = no_3;// assigning value of no3 to no2
        }


    }


    public static void main(String[] args) {

        Fibonacci_9 obj = new Fibonacci_9();
        obj.calculate(); // calling instance method with object

    }
}
