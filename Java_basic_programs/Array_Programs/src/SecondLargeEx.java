public class SecondLargeEx {

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 7, 6};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }
            else if(num> second &&  num != first){
                second = num;
            }
        }
        System.out.println("Second largest element is : " + second);
    }
}
