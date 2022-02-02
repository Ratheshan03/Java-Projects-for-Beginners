// A prime number is a number that is evenly divisible only by itself and
// 1. For example, the number 5 is prime because it can be evenly divided only
// by 1 and 5. The number 6, however, is not prime because it can be divided
// evenly by 1, 2, 3, and 6. Write a method named isPrime, which takes an integer
// from the user and returns true if the integer is a prime number, or false otherwise.
// Also write main method that displays prime numbers between 1 to 500.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for (int x=1; x<500 ;x++){
            int count =0;
            for ( int y=x; y>=1;y--){
                if (x%y==0){
                    count +=1;
                }
            }

            if (count==2){
                System.out.println(x);
            }

        }

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int a ){
        for (int x = 2; x<a;x++){
            if (a%x==0){
                return false;
            }
        }
        return true;
    }

}