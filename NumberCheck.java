/**
 * This program checks if a number is positive, negative, or zero
 * and prints the result to the console.
 */
public class NumberCheck{
    
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}