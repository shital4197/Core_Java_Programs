public class SortAscendingOrder {
    public static void main(String[] args) {
// check the given array is in sorted way or not
        int arr[] = {2,5,6,8,7};
        boolean sorted = true;

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted !");
        }
        else {
            System.out.println("Array is not sorted! ");
        }
    }
}
