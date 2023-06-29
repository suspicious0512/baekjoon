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
		
		String s = br.readLine();
		int []arr=new int [26];
		int [] check= new int[26];
		
		
		for(int i=0;i<s.length();i++) 
		{
			if((arr[(int)s.charAt(i)-97]==0)&&(check[(int)s.charAt(i)-97])==0)
			{
				arr[(int)s.charAt(i)-97]=i;
				check[(int)s.charAt(i)-97]=1;
			}
			
		}
		
		for(int i=0;i<26;i++) 
		{
			if(check[i]==0) 
			{
				arr[i]=-1;
			}
		}
		
		/* for(int i=0;i<26;i++) { System.out.printf("%d ",arr[i]); } */
		
		int count = 0;
		
		for(int i=0;i<26;i++)
		{
			
			bw.write(String.valueOf(arr[i]));
			if(count>=25) 
			{
				break;
			}
			bw.write(" ");
			count+=1;
		}
		  
		bw.flush();
		bw.close();	
	}

}
