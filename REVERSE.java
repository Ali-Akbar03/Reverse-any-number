import java.util.Scanner;

public class REVERSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, rem, rev = 0;

        System.out.print("Enter the number - ");
        num = input.nextInt(); // taking input from user

        while (num > 0) {
            rem = num % 10; // get the last digit
            rev = rev * 10 + rem; // build the reversed number
            num = num / 10; // remove the last digit
        }

        System.out.println("The reverse number is = " + rev); // corrected line

        input.close(); 
    }
}