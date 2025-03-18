public class whileLoopOddNo521to229 {

    public static void main(String[] args) {
        int num = 521;
        System.out.println("Odd numbers of 521 to 229 : ");
        while(num>=229)
        {
            if(num%2 != 0){
                System.out.println(num);
            }
            num--;
        }
    }
}
