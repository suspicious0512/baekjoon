import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ansarr [] = new int [n];
		
		for(int i= 0;i<m;i++) 
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j=s;j<=e;j++) 
			{
				ansarr [j-1]=num;
			}
			
		}
		
		for(int i=0;i<ansarr.length;i++) {
			System.out.printf("%d ",ansarr[i]);
		}
		
		

	}

}
