#include "stdio.h"
#include "gcd.h"

int lcm(int a, int b)
{
	return a * b / gcd(a, b);
}

int lcm_of_array(int *a, int size)
{
	if (a == NULL || size == 0)
		return 0;

	int l_c_m = a[0];

	for (int i = 1; i < size; i++)
	{
		l_c_m = lcm(a[i], l_c_m);
	}

	return l_c_m;
}
