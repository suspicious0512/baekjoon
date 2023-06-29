import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] arr = new String [n];
		String[] arr2 = new String [m];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=br.readLine();
		}
		
		for(int i=0;i<m;i++) {
			arr2[i]=br.readLine();
		}
		
		/*
		 * for(int i=0;i<n;i++) { System.out.println(arr[i]); }
		 */
		
		/*
		 * for(int i=0;i<m;i++) { System.out.println(arr2[i]); }
		 */
		int count=0;
		for(int y=0;y<n;y++) 
		{
			for(int x=0;x<m;x++) 
			{
				if(arr[y].equals(arr2[x])) {
					count+=1;
				}
			}
		}
		/* System.out.println("------"); */
		System.out.println(count);
		
	}
	
}