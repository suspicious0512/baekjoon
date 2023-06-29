import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		int max = -999999999;
		int where=0;
		
		for(int i=0;i<9;i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i=0;i<9;i++) {
			if(a[i]>max) {
				max=a[i];
				where = i+1;
			}
		}
		
		System.out.printf("%d\n",max);
		System.out.printf("%d",where);
		

	}

}
