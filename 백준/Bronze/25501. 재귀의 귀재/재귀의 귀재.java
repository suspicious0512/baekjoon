import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//25501
public class Main 
{

	static int b=0;
	static int recursion(String s, int l, int r) 
	{
		b+=1;
		if(l>=r) {
			return 1;
		}
		else if(s.charAt(l)!=s.charAt(r)) {
			return 0;
		}
		else return recursion(s,l+1,r-1);
	}
	
	static int isPalindrome(String s) 
	{
		return recursion(s,0,s.length()-1);
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) 
		{
			b = 0;
			System.out.printf("%d %d\n",isPalindrome(br.readLine()),b);
		}
		

	}

}
