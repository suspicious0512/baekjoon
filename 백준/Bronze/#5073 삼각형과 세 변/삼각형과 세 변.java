import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	public static boolean invalidCheck(int a, int b, int c) 
	{
		if(a+b>c&&b+c>a&&c+a>b) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==0&&b==0&&c==0) 
			{
				break;
			}
			
			boolean isInvalid = invalidCheck(a,b,c);
			
			if(isInvalid) 
			{
				System.out.println("Invalid");
			}
			else //삼각형은 만들어져서 무슨 삼각형인지 구분해야함
			{
				if(a==b&&b==c) 
				{
					System.out.println("Equilateral");
				}
				else 
				{
					if(a==b||b==c||c==a) 
					{
						System.out.println("Isosceles");
					}
					else 
					{
						System.out.println("Scalene");
					}
				}
			}
		}
		
		
	}

}
