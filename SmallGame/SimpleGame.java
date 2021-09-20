import java.util.Scanner;
/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/
public class SimpleGame {

	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	public static String convertTime(int seconds){
        String result;
        if (seconds < 0){
            result = (-1 + ":" + -1 + ":" + -1);
        }else if(seconds == 0){
            result = (0 + ":" + 0 + ":" + 0);
        }else{
            int p1 = seconds % 60;
            int p2 = seconds / 60;
            int p3 = p2 % 60;
            p2 = p2 / 60;
            result = (p2 + ":" + p3 + ":" + p1);
        }
        
        return result;
	}

	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	public static int digitsSum(int input){
        if (input < 10){
           return input; 
        } 
        int sum = 0;
        
        while (input > 0)
        {
            sum += input % 10;
            input = input / 10;
        }
        return sum;
	}
	
	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		// Ask the user which game to play.
        System.out.println("|--------Lets Play a game-------|");
        System.out.println("Options \n 1 - Seconds to 24hr time \n 2 - Adding numbers ");
		System.out.println("Select the game: (1) or (2) ");
		// Then ask the user for input and pass the value to the corresponding method.
        int input = sc.nextInt();
		
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		
		// TODO: Your code goes here
		if (input == 1){
            System.out.println("Enter the seconds: ");
            int im = sc.nextInt();
            System.out.println(convertTime(im));
        }else if (input == 2){
            System.out.println("Enter the number: ");
            int in = sc.nextInt();
            System.out.println(digitsSum(in));
        }else{
            System.out.println("You have entered a incorrect option!");
        }
		sc.close();
	}	
}