#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

int* sort(int *a, int start, int size);
int* merge(int *a, int *b, int lstart, int rstart, int lsize, int rsize);

int main()
{
	int a[] = {5, 2, 6, 1, 9, 3, 4, 8, 7};

	int *m = sort(a, 0, 9);
	
	//int l[] = {1, 3, 5};
	//int r[] = {7, 9, 12, 15};

	//int *m = merge(l, r, 3, 4);

	//for (int i = 0; i < 7; i++)
	//	printf("%d ", m[i]);

	for (int i = 0; i < 9; i++)
		printf("%d ", m[i]);
	printf("\n");

	free(m);

	return 0;
}

int* sort(int *a, int start, int size)
{
	if (size == 1)
	{
		int *m = calloc(1, sizeof(int));
		m[0] = a[start];
		return m;
	}

	int left_size = size / 2 + (size % 2 == 0)? 0: 1;
	int right_size = size / 2;
	int mid = start + size/ 2;

	int *left = NULL;
	int *right = NULL;

	if (left_size > 0)
		left = sort(a, start, left_size);

	if (right_size > 0)
		right = sort(a, mid + 1, right_size);
	
	if (left_size > 0 && right_size > 0)
	{
		int *m = merge(left, right, start, mid + 1, left_size, right_size);
		return m;
	}
	else if (left_size == 0)
	{
		return right;
	}
	else if (right_size == 0)
	{
		return left;
	}
}

int* merge(int *a, int *b, int lstart, int rstart, int lsize, int rsize)
{
	if (a == NULL || b == NULL)
		return NULL;

	int size = lsize + rsize;
	int *m = calloc(size, sizeof(int));

	int i = lstart;
	int j = rstart;
	int left_last_index = lstart + lsize;
	int right_last_index = rstart + rsize;
	int k = 0;

	while (i < left_last_index && j < right_last_index)
	{
		if (a[i] <= b[j])
		{
			m[k++] = a[i++];
		}
		else if (a[i] > b[j])
		{
			m[k++] = b[j++];
		}
	}

	while (i < left_last_index)
	{
		m[k++] = a[i++];
	}

	while (j < right_last_index)
	{
		m[k++] = b[j++];
	}

	free(a);
	free(b);

	return m;
}
