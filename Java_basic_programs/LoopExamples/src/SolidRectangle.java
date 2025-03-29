public class SolidRectangle {
    public static void main(String[] args) {

        int m = 4; // rows
        int n = 4;  // column

        // inner loop
        for(int i = 1; i<=m; i++){
            // outer loop
            for(int j = 1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }
}
