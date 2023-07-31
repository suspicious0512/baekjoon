import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	
	static int fibcount=0;
	static int fibonaccicount=0;
	
	public static int fib(int n) 
	{
		if(n==1||n==2) 
		{
			fibcount+=1;
			return 1;
		}
		else {
			return(fib(n-1)+fib(n-2));
			
		}
	}
	
	public static int fibonacci(int n) 
	{
		int [] f = new int [n+1];
		
		f[1]=1;
		f[2]=1;
		
		for(int i=3;i<=n;i++) 
		{
			f[i]=f[i-1]+f[i-2];
			fibonaccicount+=1;
		}
		
		return f[n];
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		fib(n);
		fibonacci(n);
		
		System.out.printf("%d %d",fibcount,fibonaccicount);
		
		
		
	
	}

}
