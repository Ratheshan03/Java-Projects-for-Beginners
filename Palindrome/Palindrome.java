// A nonnegative integer is called a palindrome if it reads forward and backward in the same way. 
// For example, the numbers 5, 121, 3443, and 123454321 are palindromes. Write a method that takes 
// as input a nonnegative integer and returns true if the number is a palindrome; otherwise, it returns false.

import java.util.Scanner;


public  class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative number: ");
        int number = input.nextInt();
        checkNum(number);
    }
    
    public static void checkNum(int number){
        int reminder;
        int total=0;
        int temp = number;
        
        while(number > 0 ){
            reminder = number%10;
            total = (total*10)+reminder;
            number=number/10;
        }

        if (temp==total){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    
}


