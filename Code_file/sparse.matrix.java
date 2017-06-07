import java.util.Scanner;

public class SparseMatrixOperations {

    private int row, col;
    private static int A[][], B[][], C[][];
    private Scanner get = new Scanner(System.in);

    public SparseMatrixOperations() {
        //get the matrix row and coloum size
        getMatrixSize();
        //set matrix row and coloum size
        A = new int[row][col];
        B = new int[row][col];
        C = new int[row][col];
        //set every element are zero in matrix A,B,C
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = B[i][j] = C[i][j] = 0;
            }
        }

    }

    public void getMatrixSize() {
        System.out.println("Enter the Matrix Row ,Coloum size : \nLike row,coloum ");
        String rowcol = get.next();
        String[] parts = rowcol.split(",");
        
        if (parts.length != 2) {
            System.out.println("Your entering address not valid !! ");
          
            getMatrixSize();
        } else {
         
            row = Integer.parseInt(parts[0]);
            col = Integer.parseInt(parts[1]);
        }
    }

    public void setMatrix(int X[][]) {
        String addres = get.next();
        switch (addres) {
            default:
                String[] parts = addres.split(",");
                String part1 = parts[0];
                String part2 = parts[1];
                int r = Integer.parseInt(part1);
                int c = Integer.parseInt(part2);
                if (r < row && c < col) {
                    X[r][c] = 1;
                } else {
                    System.out.println("Entering in matrix ");
                }
                setMatrix(X);
            case "End":
                break;
        }

    }

    public void printMatrix(int X[][]) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void Operation(int X[][], int Y[][], int Z[][], int Action) {
        switch (Action) {
            case 1:
                for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    Z[i][j] = X[i][j] ^ Y[i][j];
                }
            }

            case 2:
                for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    Z[i][j] = X[i][j] & Y[i][j];
                }
            }
        }
    }

    
    public static void main(String[] args) {
        
        SparseMatrixOperations s = new SparseMatrixOperations();
        Scanner command = new Scanner(System.in);
        System.out.println("-Get Matrix A,B\n");
        System.out.println("- Get Matrix A- \n ");
        s.setMatrix(A);
        System.out.println("- Get Matrix B- \n ");
        s.setMatrix(B);
        System.out.println("+++++++ Select Perform operations +++++++\nSuch as\n1. OR\n2. AND 
        \nType the number ..... ");
        int Action = command.nextInt();
        switch (Action) {
            case 1:
                s.Operation(A, B, C, 1);
            case 2:
                s.Operation(A, B, C, 2);

        }
        System.out.println("===== Print Matrix A ======");
        s.printMatrix(A);
        System.out.println("===== Print Matrix B ======");
        s.printMatrix(B);
        System.out.println("===== Output Matrix B ======");
        s.printMatrix(C);
    }

}
