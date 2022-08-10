package ArraySearchSort;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myList={ 11, 23,10,50,16,8,55,20};
        int searchItem=55;
    }
    public static int linearSearch(int[]list,int key){
        for (int i=0;i<list.length;i++)
            if (list[i]==key)
                return i;
        return -1;
    }
}
