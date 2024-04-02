
public class Main {
    public static void main(String[] args) {
        pattern10(5);
    }

    //     static void pattern2(int n) {
//        //this loop is outer loop it will increase when col is greater than row
//         for (int row = 1; row <= n; row++) {
//             // this will run when col is smaller or equal to row and if it is print star
//             // this loop is running row times
//             for(int col = 1;col<=row;col++){
//                 System.out.print("* ");
//             }
////             when one line is printed add a new line for new row
//             System.out.println();
//         }
//static void pattern1(int n) {
//    //this loop is outer loop it will increase when col is greater than row
//    for (int row = 1; row <= n; row++) {
//        // this will run when col is smaller or equal to row and if it is print star
//        // this loop is running row times
//        for(int col = 1;col<=n;col++){
//            System.out.print("* ");
//        }
////             when one line is printed add a new line for new row
//        System.out.println();
//    }
//
//    }
//    static void pattern3(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern4(int n) {
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }
//    }
//    static void pattern5(int n) {
//        for (int row = 0; row <= n*2-1; row++) {
//            int totalCols = row>n ? 2*n-row: row;
//            for (int col = 0; col < totalCols; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern28(int n) {
//        for (int row = 1; row <= n*2-1; row++) {
//            int totalCols = row>n ? 2*n-row : row;
//            int totallingSpaces = n - totalCols;
//            for(int s=0;s<totallingSpaces;s++){
//                System.out.print(" ");
//            }
//            for (int col = 0; col < totalCols; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern30(int n){
        // running row n times means how many rows we want to print
        for (int row = 1; row <=n; row++) {
            // calculating spaces in each column by subtracting total col - row
            for(int spaces = 0;spaces<n-row;spaces++){
                System.out.print("  ");
            }
            // print elements when col is greater than 0 and the value of col is row
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            // print elements after the above loop
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){

        for (int row = 1; row <=2*n; row++) {
            int totalcols = row>n ? 2*n-row:row;
            for(int spaces = 0;spaces<n-totalcols;spaces++){
                System.out.print("  ");
            }
            for(int col=totalcols;col>=1;col--) {
                System.out.print(col+" ");
            }
            for(int col=2;col<=totalcols;col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        n = 2*n;
        int orginal = 4;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valueAtEveryIndex = orginal - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(valueAtEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row=0; row<n ;row++){
            for(int space=0;space<n-row-1;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row=0; row<n ;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-row-1; space++) {
                System.out.print("  ");
            }
            int totalcols = row>0 ? row*2+1: 1;
            for (int col = 0; col <totalcols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int row = n; row >= 1 ; row--) {
            for (int space = 0; space <= n- row; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 2*row-1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 0; row <=n ; row++) {
            for (int space = 0; space <= n- row; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}