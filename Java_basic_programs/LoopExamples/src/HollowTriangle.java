public class HollowTriangle {

    public static void main(String[] args) {

        int m = 4;
        int n = 5;

        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
}
