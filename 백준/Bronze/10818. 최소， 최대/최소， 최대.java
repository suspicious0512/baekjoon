import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int max = -99999999;
		int min = 999999999;
		
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			if(b>max) {
				max=b;
			}
			if(b<min) {
				min=b;
			}
		}
		
		System.out.printf("%d %d",min,max);

	}

}