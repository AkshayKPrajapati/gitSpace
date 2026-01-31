import java.util.Scanner;

/**
 * This is a placeholder class for LeapYear functionality.
 */
public class LeapYear {
    public static void main(String[] args) {
        // Placeholder for leap year logic
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}

