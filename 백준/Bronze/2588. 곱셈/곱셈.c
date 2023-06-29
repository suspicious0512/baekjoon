#include <stdio.h>

int main() {
	int a;
	int b;
	int temp = 0;
	

	scanf("%d", &a);
	scanf("%d", &b);

	
	temp = b % 10;
	printf("%d\n", a * temp);
	
	
	temp = 0;

	temp = b / 10 % 10;
	printf("%d\n", a * temp);
	
	
	temp = 0;

	temp = b / 100;
	
	
	printf("%d\n", a * temp);
	printf("%d", a * b);
	return 0;



}