public class SimpleCalculator_18 {
    // Program passing different parameter to different methods to calculate addition, subtraction,multiplication, division

    double firstNumber, secondNumber;

    public static void main(String[] args) {

        SimpleCalculator_18 calculator = new SimpleCalculator_18();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4); // calling different methods using object
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }


    //Method 1 with return type -without parameter
    public double getFirstNumber() {

        return firstNumber;
    }

    //Method 2 with return type -without parameter
    public double getSecondNumber() {

        return secondNumber;
    }

    //Method 3 no return type with parameters
    public void setFirstNumber(double firstNo) {

        firstNumber = firstNo;

    }


    //Method 4 no return type with parameters
    public void setSecondNumber(double secondNo) {
        secondNumber = secondNo;

    }

    //Method 5 with return type -without parameter
    public double getAdditionResult() {

        double sum = firstNumber + secondNumber;
        return sum;


    }

    //Method 6 with return type -without parameter
    public double getSubtractionResult() {

        double sub = firstNumber - secondNumber;
        return sub;

    }

    //Method 7 with return type -without parameter
    public double getMultiplicationResult() {
        double multiple = firstNumber * secondNumber; // returns multiplication of two numbers
        return multiple;

    }

    //Method 8 with return type -without parameter
    public double getDivisionResult() {

        double div;
        div = firstNumber / secondNumber;
        if (secondNumber == 0) { // checking condition if second number is 0 then returning 0 value
            // as it is not possible to divide any number with 0

            return 0;
        } else {
            return div;
        }

    }


}
