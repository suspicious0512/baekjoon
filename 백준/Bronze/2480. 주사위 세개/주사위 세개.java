import java.util.Scanner;
public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int money = 0;
		
		if(a==b&&b==c) 
		{
			money=money+10000+a*1000;
		}
		
		else if (a==b || a==c)
		{
			money=money+1000+a*100;
		}
		else if (c==b) 
		{
			money=money+1000+b*100;
		}
		else 
		{
			int max = a;
			if (b>max)
				max =b;
			if( c>max)
				max =c;
			
			money+=max*100;
		}
		
		System.out.println(money);
		
	}

}