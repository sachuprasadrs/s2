import java.util.Scanner;
class MatrixAdd{
	public static void main(String args[]){
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		int i,j,r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of 1st matrix");
		r1=sc.nextInt();
		System.out.println("Enter the column of 1st matrix");
		c1=sc.nextInt();
		System.out.println("Enter the elements of 1st matrix");
		for(i=0;i<r1;i++){
			for (j=0;j<c1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the row of 2nd matrix");
		r2=sc.nextInt();
		System.out.println("Enter the column of 2nd matrix");
		c2=sc.nextInt();
		System.out.println("Enter the elements of 2nd matrix");
		for(i=0;i<r2;i++){
			for (j=0;j<c2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r2;i++){
			for (j=0;j<c2;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of matrix is: ");
		System.out.println();
		for(i=0;i<r2;i++){
			for (j=0;j<c2;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
