public class LargestElement {

   public static void main(String[] args) {

      int [] arr = {5,9,2,4,6};
      int largest = arr[0];

      for(int i = 0; i< arr.length; i++){
         if(arr[i]>largest){
            largest = arr[i];
         }
      }
      System.out.println("The largest element is: " + largest);
   }
}
