
import java.util.Scanner;

public class Program_3 {

    // Program to check entered character is Vowel or Consonant.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program_3 obj = new Program_3();

        char c;
        System.out.println("Enter Single character :");

        c = s.next().charAt(0);// here we are reading the single character as string and getting the first
        //character using charAt(0) from that string.
        obj.isLetter(c);

    }

    // instance method created to check whether entered character is vowel,Consonant
    public void isLetter(char c) {
        int i = 0;
        switch (c) {
            case 'a':
            case 'A':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            case 'e':
            case 'E':
                i++;

        }

        if (i == 1)
            System.out.println("Entered character " + c + " is Vowel.");

        else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println("Entered character " + c + " is Consonant.");

        } else {
            System.out.println("Not an alphabet.");
        }


    }
}
