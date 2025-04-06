public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[] = {5,9,2,1,7,10,30};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>secondlargest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< secondlargest && arr[i] != largest){
                secondlargest = arr[1];
            }
        }
        System.out.println("Second largest element is : " + secondlargest);
    }
}