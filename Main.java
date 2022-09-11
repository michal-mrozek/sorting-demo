public class Main {
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int [] sort_arr, int len) {
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {10,5,3,1,24,12};
        int len = array.length;
        bubbleSort(array,len);


        System.out.println("Bubble Sort:");
        System.out.println("Insertion Sort:");

        
        int [] array2 = {3,6,2,10,3,7,11,0};
        insertionSort(array2);
    }
}
