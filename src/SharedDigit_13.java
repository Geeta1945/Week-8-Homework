
public class SharedDigit_13 {
// program calling method and checking within it that provided two numbers within the range or not -10 (inclusive) - 99 (inclusive).
    public static void main(String[] args) {

        SharedDigit_13 obj = new SharedDigit_13(); // created object for instance method

        obj.hasShareDigit(12, 23);// here you can sout the method itself rather than writing sout statements in method
        obj.hasShareDigit(9, 99);
        obj.hasShareDigit(-1, 55);
    }

    public boolean hasShareDigit(int a, int b) { // method returning boolean -true or false value and accepting 2 int parameters

        if ((a >= 10 && a < 99) && (b >= 10 && a <= 99)) { // checking that both entered numbers within the range or not
            System.out.println("true");

            return true;
        } else { // if not within the range than print false
            System.out.println("false");

            return false;

        }
    }


}
