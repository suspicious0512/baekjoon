import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int howmany = sc.nextInt();
		
		for(int y=1;y<=howmany;y++) 
		{
			
			for(int x=1;x<=howmany-y;x++) 
			{
				System.out.print(" ");
			}
			for(int x=1;x<=y;x++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}