// factorial function using a loop

import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        checkFactorial(number);
    }

    public static void checkFactorial(int number){
        int total = 1;
        int count = 1;

        while ( count <= number){
            total = total * count;
            count++;
        }
        System.out.println( number+ "! = " + total);
    }
    
}