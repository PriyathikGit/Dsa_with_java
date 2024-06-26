package Patterns_Sorting;

public class Triangle {
    public static void main(String[] args) {
//        triangle(4,0);
        triangle2(3,0);
    }
    // reverse
    static void triangle(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            triangle(row,col+1);
        } else{
            System.out.println();
            triangle(row-1, 0);
        }
    }
    // normal
    static void triangle2(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            triangle2(row,col+1);
            System.out.print("* ");

        } else{
            triangle2(row-1, 0);
            System.out.println();
        }
    }

}
