// Given a string S and two indices, start and end, print a substring consisting
//  of all characters in the inclusive range from start to end-1. 


import java.lang.reflect.Method;
import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String word = input.next();
        System.out.println("Enter the start index: ");
        int start = input.nextInt();
        System.out.println("Enter the end index: ");
        int end = input.nextInt();
        Substring(word, start, end);
    }

    public static void Substring(String str, int x, int y) {
        String ouput = str.substring(x, y);
        System.out.println("Output is " + ouput);
    }
    
}
