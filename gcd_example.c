#include "stdio.h"
#include "gcd.h"

int main()
{
	int a = 25;
	int b = 5;
	printf("GCD(%d, %d) = %d\n", a, b, gcd(a, b));

	int array[] = {6, 12, 18, 24};

	printf("GCD_OF_ARRAY(array) = %d\n", gcd_of_array(array, 4));

	return 0;
}
