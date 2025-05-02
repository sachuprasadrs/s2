import java.util.*;
class NegativeException extends Exception {
	NegativeException(String s) {
		super(s);
	}
}
class NegExcept{
	
	static void posneg(int m) throws NegativeException{
		int a,avg,sum=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		for(int i=0;i<m;i++)
		{
			a=s1.nextInt();
			if(a < 0){
				throw new NegativeException("Negative number");
			}
			else
			{
			 sum=sum+a;
			}
			
		}
		avg=sum/m;
		System.out.println("avg of nos = "+avg);
	}
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit of number");
		n=sc.nextInt();
		try{
			posneg(n);
		}
		catch(NegativeException s){
			System.out.println(s);
		}
		finally{
			System.out.println("end....");
		}
	}
}
