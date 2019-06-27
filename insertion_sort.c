#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

bool sort(int **a, int size);
bool swap(int *a, int *b);

int main()
{
	int *a = calloc(9, sizeof(int));
	a[0] = 2;
	a[1] = 1; 
	a[2] = 5;
	a[3] = 4;
	a[4] = 9;
	a[5] = 8;
	a[6] = 6;
	a[7] = 7;
	a[8] = 3;
	sort(&a, 9);

	for (int i = 0; i < 9; i++)
		printf("%d ", a[i]);

	printf("\n");

	free(a);
	return 0;
}

bool sort(int **a, int size)
{
	if (a == NULL || (*a) == NULL)
		return false;

	for (int i = 0; i < size; i++)
	{
		int j = i;
		while (j > 0)
			if ((*a)[j] < (*a)[j - 1])
			{
				swap(&((*a)[j]), &((*a)[j - 1]));
				j--;
			} 
			else 
				break;
	}
}

bool swap(int *a, int *b)
{
	int t = *a;
	*a = *b;
	*b = t;
}
