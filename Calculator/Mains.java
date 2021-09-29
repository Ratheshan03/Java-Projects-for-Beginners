import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("-----------------Menu Options------------------");
System.out.println(
" Addition \n Subtraction \n Multiplication \n Division \n Squareroot \n Square \n Cube \n Sine \n Cosine \n Tangent");
System.out.print(" Enter the operation: ");
String op = input.nextLine();
Calculator Cal = new Calculator();
if (op.equals("Addition")) {
System.out.print("Enter Number 1: ");
int num1 = input.nextInt();
System.out.print("Enter Number 2: ");
int num2 = input.nextInt();
System.out.println("Output: " + Cal.addition(num1, num2));
}
else if (op.equals("Subtraction")) {
System.out.print("Enter Number 1: ");
int num1 = input.nextInt();
System.out.print("Enter Number 2: ");
int num2 = input.nextInt();
System.out.println("Output: " + Cal.subtration(num1, num2));
}
else if (op.equals("Multiplication")) {
System.out.print("Enter Number 1: ");
int num1 = input.nextInt();
System.out.print("Enter Number 2: ");
int num2 = input.nextInt();
System.out.println("Output: " + Cal.multiplication(num1, num2));
}
else if (op.equals("Division")) {
System.out.print("Enter Number 1: ");
int num1 = input.nextInt();
System.out.print("Enter Number 2: ");
int num2 = input.nextInt();
System.out.println("Output: " + Cal.division(num1, num2));
}

else if (op.equals("Squareroot")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.squareRoot(num));
    }
    else if (op.equals("Square")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.square(num));
    }
    else if (op.equals("Cube")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.cube(num));
    }
    else if (op.equals("Sine")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.CalculateSin(num));
    } else if (op.equals("Cosine")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.CalculateCos(num));
    } else if (op.equals("Tangent")) {
    System.out.print("Enter a Number: ");
    int num = input.nextInt();
    System.out.println("Output: " + Cal.CalculateTan(num));
    } else {
    System.out.println("Enter a Valid Operation!");
    }
    }
}