import java.util.Scanner;

/**Java CMD program for checking whether the input number is a multiple of base or not.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Is_Multiple_Of_Base{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");

            /** reading the next integer number and storing it in number integer variable */
            int number = input.nextInt();
            System.out.print("Enter the divisor: ");

            /** reading the next integer number and storing it in divisor integer variable */
            int divisor = input.nextInt();

            if (is_Multiple_Of_Base(number, divisor)){
                System.out.println(number + " is a multiple of " + divisor + ".");
            } else{
                System.out.println(number + " is not a multiple of " + divisor + ".");
            }
            System.out.println("*************************************************");
        }
    }

    /** 
     * method for calculating the factorial of input with a recursive method.
     * @param number  int number to calculate the factoriaal
     * @return  factorial of the input number with long data type
     * <pre>
     *      factorial_Calculator_Loop(0); // Output: 1
     *      factorial_Calculator_Loop(4); // Output: 24
     * </pre>
    */
    public static boolean is_Multiple_Of_Base(int number, int divisor){
        
        /** avoid division by zero */
        if (divisor == 0){
            return false; 
        }
        return number % divisor == 0;
    }
}