import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n;i<2*n-1;i++) 
		{
			for(int j=2*n-1-i;j>0;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*(i-n+1)-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i=0;i<2*n-1;i++) 
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		for(int i=n;i<2*n-1;i++) 
		{
			for(int x=0;x<i-n+1;x++) 
			{
				System.out.print(" ");
			}
			
			for(int x=2*((2*n-1)-i)-1;x>0;x--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
