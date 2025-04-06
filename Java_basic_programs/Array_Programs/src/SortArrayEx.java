import java.util.Arrays;

public class SortArrayEx {

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 6, 8};

        // Bubble Sort in descending order
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Array elements after sorting (Descending):");
        System.out.println(Arrays.toString(arr));
    }
}
