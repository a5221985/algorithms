#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

int* sort(int *a, int left_index, int size);
int* merge(int *a, int left_index_a, int size_a, int *b, int left_index_b, int size_b);
bool print(int *a, int size);

int main()
{
	int *a = calloc(9, sizeof(10));
	a[0] = 2;
	a[1] = 1;
	a[2] = 3;
	a[3] = 5;
	a[4] = 4;
	a[5] = 8;
	a[6] = 9;
	a[7] = 7;
	a[8] = 6;
	
	int *s = sort(a, 0, 9);
	print(a, 9);
	print(s, 9);

	free(a);
	return 0;
}

int* sort(int *a, int left_index, int size)
{
	if (a == NULL)
		return NULL;

	if (size == 0 || size == 1)
		return a;

	int mid_index = (left_index + size) / 2;
	int right_index = mid_index + 1;
	int left_size = size / 2;
	int right_size = size - left_size;

	int *ls = sort(a, left_index, left_size);
	int *rs = sort(a, right_index, right_size);
	return merge(ls, left_index, left_size, rs, right_index, right_size);
}

int* merge(int *a, int left_index_a, int size_a, int *b, int left_index_b, int size_b)
{
	if (a == NULL || b == NULL)
		return NULL;

	if (size_a == 0 && size_b != 0)
		return b;

	if (size_b == 0 && size_a != 0)
		return a;

	if (size_a == 0 && size_b == 0)
		return calloc(size_a, sizeof(int));

	int *s = calloc(size_a + size_b, sizeof(int));

	int i = left_index_a;
	int j = left_index_a;
	int k = 0;
	while (i < size_a && j < size_b)
	{
		if (a[i] < b[j])
			s[k++] = a[i++];
		else
			s[k++] = b[j++];
	}

	while (i < size_a)
		s[k++] = a[i++];

	while (j < size_b)
		s[k++] = b[j++];

	return s;
}

bool print(int *a, int size) {
	for (int i = 0; i < size; i++)
		printf("%d ", a[i]);

	printf("\n");
}
