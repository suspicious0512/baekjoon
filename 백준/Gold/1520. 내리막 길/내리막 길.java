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
		StringTokenizer st = new StringTokenizer(br.readLine());
		//가로 세로 입력받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		//배열 만들기
		int[][] arr = new int [n][m];
		int [][] dp = new int [n][m];
		//배열에 높이 입력하기
		for(int i=0;i<n;i++) 
		{
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) 
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				dp[i][j]=-1;
			}
		}
		bw.write(String.valueOf(dfs(0,0,n, m, arr,dp)));
		bw.flush();
		bw.close();
	}
	
	public static int dfs(int y, int x, int n, int m,int[][] arr, int[][] dp) 
	{
		int [] dy = {0,0,1,-1};
		int [] dx = {1,-1,0,0};
		if(y==n-1&&x==m-1) 
		{
			return 1;
		}
		if(dp[y][x]!=-1) 
		{
			return dp[y][x];
		}
		
		dp[y][x]=0;// 초기화를 -1로 했으니 계산 시작 의미로 0으로 초기화
		
		for(int i=0;i<4;i++) 
		{
			int newY = y+dy[i];
			int newX = x+dx[i];
			
			if(newX>=0 && newX<m && newY>=0 && newY<n) 
			{
				if(arr[newY][newX]<arr[y][x]) 
				{
					dp[y][x]+=dfs(newY, newX, n, m, arr, dp);
				}
			}
		}
		return dp[y][x];
	}

}
