import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) 
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
		int checksum =0;
		int ans = 0;
		for(int i=0;i<arr.length-2;i++) 
		{
			checksum+=arr[i];
			for(int j=i+1;j<arr.length-1;j++) 
			{
				checksum+=arr[j];
				for(int k=j+1;k<arr.length;k++) 
				{
					checksum+=arr[k];
					if(ans<checksum&&checksum<=m) 
					{
						ans=checksum;
					}
					checksum-=arr[k];
				}
				checksum-=arr[j];
			}
			checksum-=arr[i];
		}
		//bw.write(String.valueOf(ans));
		//bw.flush();
		//bw.close();
        System.out.println(ans);
				
		
	}

}
