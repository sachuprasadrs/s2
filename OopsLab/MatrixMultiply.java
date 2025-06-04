import java.util.Scanner;
class MatrixMultiply {
    public static void main(String args[]) {
        int a[][] = new int[20][20];
        int b[][] = new int[20][20];
        int c[][] = new int[20][20];
        int i, j, k, r1, r2, c1, c2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of 1st matrix");
        r1 = sc.nextInt();
        System.out.println("Enter the column of 1st matrix");
        c1 = sc.nextInt();
        System.out.println("Enter the elements of 1st matrix");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the row of 2nd matrix");
        r2 = sc.nextInt();
        System.out.println("Enter the column of 2nd matrix");
        c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must equal rows of second.");
            return;
        }

        System.out.println("Enter the elements of 2nd matrix");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication logic
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices is: ");
        System.out.println();
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
