import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//1978
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int ans = 0;
	
		int[] arr = new int [a];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<a;i++) 
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<a;i++) 
		{
			int count = 0;
			
			for(int j = 1;j<arr[i];j++) 
			{
				if(arr[i]%j==0) {
					count+=1;
				}
			}
			
			if(count==1) {
				ans+=1;
			}
			
		}
		
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
		
		
	}

}
