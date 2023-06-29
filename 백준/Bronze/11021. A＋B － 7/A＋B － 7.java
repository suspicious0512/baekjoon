import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int howmany = sc.nextInt();
		int a =0;
		int b =0;
		for(int i = 0;i<howmany; i++) {
			a =sc.nextInt();
			b =sc.nextInt();
			System.out.printf("Case #%d: %d\n",i+1,a+b);
		}
		
	}
}