#include "stdio.h"
#include "gcd.h"

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

int gcd_of_array(int *a, int size)
{
	if (a == NULL || size == 0)
		return 0;

	int g = a[0];
	for (int i = 1; i < size; i++)
	{
		g = gcd(a[i], g);
	}

	return g;
}
