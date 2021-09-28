// Compute the natural logarithm of 2, by adding up to n terms in the series
// 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
// where n is a positive integer and input by user.


import java.util.Scanner;
public class T6Q6{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    int num = input.nextInt();
    double total=0;
    int num2 =1;
    
    for (int x=1; x<=num;x++){
        total+= (2.0*num2)/x;
        num2 *= -1;
    }
    System.out.println("Total logarithm of 2 up to "+ num + " is "+total);
    }
}
