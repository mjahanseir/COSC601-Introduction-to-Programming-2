package ArraySearchSort;

public class myLinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        System.out.println( linearSearch(list, 4)); // Returns 1
        System.out.println( linearSearch(list,-4)); // Returns −1
        System.out.println( linearSearch(list,-3));// Returns 5
    }

    public static int linearSearch(int[] input, int key){
        for (int i=0;i<input.length; i++){
            if(input[i]==key){
                return i;
            }
        }
        return -1;
    }
}
