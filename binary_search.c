#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

bool binary_search(int *a, int start, int size, int key, int *index);
int main()
{
	int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	int *index = malloc(sizeof(int));
	
	for (int i = 1; i <= 9; i++)
	{
		bool found = binary_search(a, 0, 9, i, index);
		printf("%d\n", (*index));
	}

	free(index);
	return 0;
}

bool binary_search(int *a, int start, int size, int key, int *index)
{
	if (a == NULL || size == 0 || index == NULL)
		return false;

	int mid = start + size / 2;

	if (a[mid] == key)
	{
		(*index) = mid;
		return true;
	} 
	else if (key < a[mid])
	{
		return binary_search(a, start, mid - start, key, index);
	}
	else if (key > a[mid])
	{
		return binary_search(a, mid + 1, size - mid - 1 + start, key, index);
	}

	return false;
}
