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
		
		int a = s.length();
		
		int []check = new int [26];
		
		for(int i=0;i<a;i++) 
		{
			if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90) 
			{
				check[(int)s.charAt(i)-65]+=1;
			}
			
			else if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122) 
			{
				check[(int)s.charAt(i)-97]+=1;
			}
		}
		
		/*
		 * for(int i=0;i<26;i++) { System.out.printf("%d ",check[i]); }
		 */
		
		int max= -9999;
		
		for(int i=0;i<26;i++) 
		{
			
			if(check[i]>max) 
			{
				max=check[i];
			}
		}
		
		int count = 0;
		
		for(int i=0;i<26;i++) 
		{
			if(check[i]==max) 
			{
				count+=1;
			}
		}
		
		char ans;
		int where = 0;
		
		if(count>1) 
		{
			
			/* System.out.println('?'); */
			bw.write('?');
		}
		else 
		{
			for(int i=0;i<26;i++) 
			{
				if(check[i]==max) 
				{
					where = i;
				}
			}
			
			bw.write((char)where+65);
			/* System.out.printf("%c",where+65); */
		}
		
		bw.flush();
		bw.close();
		
		
		
		
	}

}
