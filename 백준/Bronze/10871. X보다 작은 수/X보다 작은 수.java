import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int howmany = sc.nextInt();
		
		int x = sc.nextInt();
		int t =0;
		for(int i=0;i<howmany;i++) {
			t=sc.nextInt();
			if(t<x) {
				System.out.printf("%d ",t);
			}
		}
		
	}
}