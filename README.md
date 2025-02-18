# Reverse-any-number
Code Explanation
java
Copy code
import java.util.Scanner;
This line imports the Scanner class from the java.util package, which is used to read input from the user.
java
Copy code
public class REVERSE {
This line defines a public class named REVERSE. In Java, every application must have at least one class definition.
java
Copy code
    public static void main(String[] args) {
This is the main method, which is the entry point of any Java application. The program execution starts from this method.
java
Copy code
        Scanner input = new Scanner(System.in);
Here, we create a Scanner object named input that reads input from the standard input stream (usually the keyboard).
java
Copy code
        int num, rem, rev = 0;
We declare three integer variables:
num: to store the number entered by the user.
rem: to store the remainder when dividing num by 10 (used to extract digits).
rev: initialized to 0, this will hold the reversed number.
java
Copy code
        System.out.print("Enter the number - ");
        num = input.nextInt(); // taking input from user
The program prompts the user to enter a number and reads that number using input.nextInt(), storing it in the variable num.
java
Copy code
        while (num > 0) {
This line starts a while loop that continues as long as num is greater than 0. This loop will be used to extract digits from num.
java
Copy code
            rem = num % 10; // get the last digit
Inside the loop, we calculate the last digit of num using the modulus operator (%). For example, if num is 1234, rem will be 4.
java
Copy code
            rev = rev * 10 + rem; // build the reversed number
We update rev by multiplying it by 10 (to shift its digits left) and adding rem. This effectively builds the reversed number. For example:
If rev is 0 and rem is 4, then rev becomes 0 * 10 + 4 = 4.
In the next iteration, if num is 123, rem will be 3, and rev will become 4 * 10 + 3 = 43.
java
Copy code
            num = num / 10; // remove the last digit
We update num by dividing it by 10 (using integer division), which removes the last digit. For example, if num is 1234, it becomes 123.
java
Copy code
        }
This closes the while loop. The loop will continue until num becomes 0.
java
Copy code
        System.out.println("The reverse number is = " + rev); // corrected line
After the loop, we print the reversed number stored in rev.
java
Copy code
        input.close(); // It's a good practice to close the scanner
Finally, we close the Scanner object to free up system resources. This is a good practice to prevent resource leaks.
Summary
The program reads an integer from the user, reverses its digits using a loop, and prints the reversed number. The logic relies on extracting the last digit of the number repeatedly and building the reversed number by shifting the digits of the reversed number left.
