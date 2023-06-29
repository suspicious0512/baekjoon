import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{
	
	static int change(int t) 
	{
		int temp=0;
		int ans=0;
		
		temp = t;
		
		for(int i=0;i<3;i++) 
		{
			int temptemp = (int) Math.pow(10, 2-i);
			ans+=(temp%10)*(temptemp);
			temp/=10;
		}
		
		return ans;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		a=change(a);
		b=change(b);
		
		if(a>b) 
		{
			bw.write(String.valueOf(a));
		}
		else {
			bw.write(String.valueOf(b));
		}
		
		bw.flush();
		bw.close();
		
		
	}

}
