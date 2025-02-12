import java.util.Scanner;
class MatrixSymmetry {
	public static void main(String args[]) {
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int i, j, r1, c1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of matrix");
		r1 = sc.nextInt();
		System.out.println("Enter the column of matrix");
		c1 = sc.nextInt();
		if (r1 != c1) {
			System.out.println("Matrix is not square, cannot be symmetric.");
			return;
		}
		System.out.println("Enter the elements of matrix");
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		boolean isSymmetric = true;
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c1; j++) {
				if (a[i][j] != a[j][i]) {
					isSymmetric = false;
					break;
				}
			}
			if (!isSymmetric) {
				break;
			}
		}
		if (isSymmetric) {
			System.out.println("The matrix is symmetric.");
		}
		else {
			System.out.println("The matrix is not symmetric.");
		}
	}
}
