package ArraySearchSort;

public class BinarySearch {
    public static void main(String[] args) {

        int[] mylist = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(mylist, 5));
        System.out.println(binarySearch(mylist, 15));
    }

    public static int binarySearch(int[] list, int key) {

        int low = 0;
        int high = list.length;
        int mid = list.length / 2;

        while (list.length > 0) {
            if (list[mid] == key)
                return mid;
            else if (key > list[mid])
                low = mid + 1;
            else if (key > list[mid])
                high = mid - 1;
        }
        return -1;
    }
}

