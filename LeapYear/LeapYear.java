// For any year input by the user, write a program to determine whether the year is a leap year or not.
// Leap Years are any years that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
// Example: 
// 1992      Leap Year
// 2000      Leap Year
// 1900      NOT a Leap Year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if (year%4==0 && (year%100==0 && year%400==0)){
            System.out.println("It is a leap year!");
        }else{
            System.out.println("Not a leap year :(");
        }
    }
    
}
