import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main 
{
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,m;
	static int[] arr;

	public static void main(String[] args) throws IOException
	{
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		//정렬
		/*
		 * for(int i=0;i<n;i++) { for(int j=i;j<n;j++) { if(arr[i]>arr[j]) { int tmp =
		 * arr[i]; arr[i]=arr[j]; arr[j]=tmp; } } }
		 */
		
		Arrays.sort(arr);
		
		m = Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<m;i++) 
		{
			
			int num = Integer.parseInt(st.nextToken());
			if(find(num)) 
			{
				bw.write("1 ");
			}
			else {
				bw.write("0 ");
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	private static boolean find(int num) 
	{
		int left =0;
		int right=n-1;
		while(left<=right) 
		{
			int mid = (left+right)/2;
			if(arr[mid]<num) 
			{
				left=mid+1;
			}
			else if(arr[mid]>num)
			{
				right=mid-1;
			}
			else {
				return true;
			}
		}
		
		return false;
	}

}
