import java.util.Scanner;
public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int inputM = sc.nextInt();
		
		int ans = M+inputM;
		
		
		while (ans>=60) 
		{
			ans-=60;
			H+=1;
			if (H==24)
				H=0;
			
		}
		
		System.out.printf("%d %d",H,ans);
		
	}

}