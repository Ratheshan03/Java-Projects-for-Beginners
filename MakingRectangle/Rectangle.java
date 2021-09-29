import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int row = input.nextInt();
        System.out.print("Enter the Width: ");
        int col = input.nextInt();
        print_shapes(row, col);
    }

    public static void print_shapes(int n, int m) {
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= m; y++) {
                if (x == 1 || x == n || y == 1 || y == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    } 
}
