package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting values of the variables

        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        // Displaying values of the variables
        System.out.println("Prime's name : ");
        System.out.println("Prime's age : ") ;
        System.out.println("Prime's rollNo : ");
        // Direct access of rollNo is not possible due to encapsulation

    }
}
