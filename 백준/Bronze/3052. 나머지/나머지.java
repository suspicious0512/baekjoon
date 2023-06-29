import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int [10];
		int b[] = new int [10];
		int count = 0;
		
		for(int i=0;i<10;i++) {
			a[i]=(sc.nextInt())%42;
		}
		
		int check[] = new int [42];
		
		for(int i=0;i<10;i++) 
		{
			if(check[a[i]]!=1) 
			{
				b[i]=a[i];
				check[a[i]]=1;
			}
		}
		
		for(int i=0;i<42;i++) {
			if(check[i]==1) {
				count +=1;
			}
		}
		
		System.out.println(count);
	}

}
