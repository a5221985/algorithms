#include "stdio.h"

int gcd(int, int);
int lcm(int, int);

int main()
{
	int a[] = {2, 6};
	int b[] = {24, 36};

	printf("GCD: %d\n", gcd(12, 18));
	printf("LCM: %d\n", lcm(12, 18));

	return 0;
}

int gcd(int a, int b)
{
	if (a == 0)
		return b;

	if (b == 0)
		return a;

	if (a < b)
		return gcd(a, (b % a));
	else if (b < a)
		return gcd(b, (a % b));
}

int lcm(int a, int b)
{
	return a * b / gcd(a, b);
}
