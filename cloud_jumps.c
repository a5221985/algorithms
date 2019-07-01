#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

int min_jumps(int *a, int p, int size, int *jumps);
int min(int a, int b);

int main()
{
	int a[] = {0, 1, 0, 0, 0, 1, 0};
	int jumps[7] = {-1, -1, -1, -1, -1, -1, -1};
	int size = 7;

	int j = min_jumps(a, 0, size, jumps);

	printf("JUMPS: %d\n", j);

	return 0;
}

int min_jumps(int *a, int p, int size, int *jumps)
{
	if (jumps[p] != -1)
		return jumps[p];

	if (a == NULL || size == 0)
		return -1;

	if (p == (size - 1) && a[p] == 0)
		jumps[p] = 0;
	else
	{
		int j1 = -1;
		int j2 = -1;
		
		if (a[p + 1] != 1)
			j1 = min_jumps(a, p + 1, size, jumps);
		
		if (a[p + 2] != 1)
			j2 = min_jumps(a, p + 2, size, jumps);

		if (j1 != -1 && j2 != -1)
		{
			jumps[p] = min(j1, j2) + 1;
		}
		else if (j1 != -1)
		{
			jumps[p] = j1 + 1;
		}
		else if (j2 != -1)
		{
			jumps[p] = j2 + 1;
		}
	}

	return jumps[p];
}

int min(int a, int b)
{
	if (a < b)
		return a;
	else 
		return b;
}
