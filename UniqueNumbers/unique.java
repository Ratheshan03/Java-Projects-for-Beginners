public class unique {
    // Assigning the array with six values
    static int[] arr = new int[6];
    public static void main(String[] args) { // args is back keep the good namein
        Random random = new Random();
        int count = 0;
        while (count < 6) {
            //random intial value is 0, so we are adding 1
            int randomNum = 1 + random.nextInt(49);
            if (!Uniques(randomNum)) {
                arr[count] = randomNum;
                ++count;
            }
        }

        System.out.println("|---Unique Numbers---|");
        System.out.println();
        for (int x: arr)
            System.out.print( x + " ");
        }

    /**
     * Checking the array for any duplicates.
     * @param A number in the array.
     * @return true if no duplicate OR return false.
     */
    static boolean Uniques(int a) {
        for (int y: arr) {
            if (y == a){
                return true;
            }    
        }
        return false;
    }
}
