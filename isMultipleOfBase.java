/*Check whether the input number is a multiple of base or not*/

import java.util.Scanner;

public class isMultipleOfBase{
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            if (isMultiple(number, divisor)) {
                System.out.println(number + " is a multiple of " + divisor + ".");
            } else {
                System.out.println(number + " is not a multiple of " + divisor + ".");
            }
        }
    }

    public static boolean isMultiple(int number, int divisor) {
        if (divisor == 0) {
            return false; // Avoid division by zero
        }
        return number % divisor == 0;
    }
}


//by Arman Azarnik