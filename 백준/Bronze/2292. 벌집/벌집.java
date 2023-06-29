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
		int start = 1;
		int where = 0;
		for(int i=1;i<18259;i++) 
		{
			if(a<=start) 
			{
				where=i;
				break;
			}
			start+=6*i;
		}
		
		bw.write(String.valueOf(where));
        bw.flush();
        bw.close();

	}

}
