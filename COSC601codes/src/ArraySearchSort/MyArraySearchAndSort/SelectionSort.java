package ArraySearchSort.MyArraySearchAndSort;

public class SelectionSort {

    public static void main(String[] args) {
        double[] myarr={9.5,2.5,11.5,3.5,1.5,5.5};
        selectionSort(myarr);
        for(double value: myarr)
            System.out.println(value);
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = array[0];
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (index != i) {
                array[index] = array[i];
                array[i] = min;
            }
        }
    }


    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}


