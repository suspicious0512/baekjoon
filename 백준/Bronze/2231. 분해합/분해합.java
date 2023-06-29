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
		int checksum=0;
		int ans=0;
		int temp=0;
		
		for(int i=1;i<a;i++) 
		{
			checksum+=i;
			temp=i;
			while(temp!=0) 
			{
				checksum+=temp%10;
				temp/=10;
			}
			if(checksum==a) 
			{
				ans=i;
				break;
			}
			checksum=0;
			temp=0;
		}
		
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();

	}

}
