import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		
		//1. 9x9 2차원 배열 arr을 만든다.
		//2. 입력을 받고 최대값을 -999로 설정한다.
		//3. 반복문 안에서 배열 arr의 모든 원소를 돌려서 최대값을 찾는다.
		//4. 최대값을 찾았다면 한번 더 돌려서 위치를 확인한다.
		//5. 최대값을 출력하고 위치를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][] arr = new int [9][9];
		
		for(int y=0;y<9;y++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int x=0;x<9;x++) 
			{
				arr[y][x]=Integer.parseInt(st.nextToken());
			}
			
		}
		
		int max = -999;
		int index_x = 0;
		int index_y=0;
		
		for(int y=0;y<9;y++) 
		{
			for(int x=0;x<9;x++) 
			{
				if(arr[y][x]>max) 
				{
					max=arr[y][x];
					index_x=x;
					index_y=y;
				}
			}
		}
		
		System.out.printf("%d\n%d %d",max,index_y+1,index_x+1);
		
		
	}

}
