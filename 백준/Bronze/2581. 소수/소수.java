import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int count =0;
		int ans=0;
		int min =0;
		boolean check =false;
		
		for(int i = a;i<=b;i++) 
		{
			for(int j =1;j<i;j++) 
			{
				if(i%j==0) 
				{
					count+=1;
				}
			}
			
			if(count==1) 
			{
				if(check==false) 
				{
					min = i;
					check=true;
				}
				ans+=i;
			}
			count=0;
		}
		
		if(ans==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
			System.out.println(min);
		}

	}

}
