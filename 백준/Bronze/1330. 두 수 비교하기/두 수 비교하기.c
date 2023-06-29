int main() //1330 두 수 비교하기
{
	int a, b;
	scanf("%d %d", &a, &b);

	if (a > b)
		printf(">");
	else if (a < b)
		printf("<");
	else if (a == b)
		printf("==");

	return 0;
}