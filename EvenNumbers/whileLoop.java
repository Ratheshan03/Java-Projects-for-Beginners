public class whileLoop {
    public static void main(String[] args) {
        System.out.println("|-----Printing even numbers between (0-100)-----|");
        int x = 1;
        while (x<=100){
            if (x%2 == 0){
                System.out.println(x);
            }
            x++;
        }
    }
}
