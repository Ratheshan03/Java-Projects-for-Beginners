// Numbers to Words - changing any numbers to its word form.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = input.nextInt();
        Float number = (float)num;
        int cent = (int)Math.floor(( number - num ) * 100.0f );

        // Objects created of class numOnWords
        numOnWords nw = new numOnWords();
        nw.words((num / 1000000000), " Hundred");
        nw.words((num / 10000000)% 100, " Crore");
        nw.words((num / 100000)% 100, " Lakh");
        nw.words((num / 1000)% 100, " Thousand");
        nw.words((num / 100)% 100, " Hundred");
        nw.words((num % 100), " ");
    }

}

class numOnWords {
    void words( int num, String ch){
        String one[] = {" ", " One", " Two", " Three"," Four",
                        " Five", " Six", " Seven"," Eight"," Nine"," Ten"," Eleven",
                        " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen",
                        " Seventeen", " Eighteen", " Nineteen" };

        String ten[] = {" ", " ", " Twenty", " Thirty"," Forty",
                        " fifty", " Sixty"," Seventy"," Eighty"," Ninety"};
        
        if (num >19){
            System.out.print(ten[num/10] + " " + one[num % 10]);
        }else{
            System.out.print(one[num]);
        }

        if(num>0) {
            System.out.print(ch);
        }
    }
}