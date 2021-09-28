// factorial function using a rescursion

/**
 * factorial2
 */
public class factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = checkFactorial(number);
        System.out.println(number +"! = "+ result);
    }

    public static int checkFactorial(int number){
        if ( number==0){
            return 1;
        }else{
            return number * checkFactorial(number-1);
        }
    }
    
}

