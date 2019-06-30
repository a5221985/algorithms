#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

int num_bars(int *a, int size, int index, int d, int m);

int main()
{
	int a[] = {2, 9, 1, 2, 6, 1, 5, 3};
	int size = 8;
	int index = size - 1;
	int d = 8;
	int m = 2;

	int num = num_bars(a, size, index, d, m);

	printf("NUM OF BARS: %d\n", num);
	return 0;
}

int num_bars(int *a, int size, int index, int d, int m)
{
	if (a == NULL || index < 0 || (m == 1 && d != a[index]))
		return 0;

	if (m == 1 && d == a[index])
		return 1;

	int num = num_bars(a, size - 1, index - 1, d, m) + num_bars(a, size - 1, index - 1, d - a[index], m - 1);

	return num;
}
