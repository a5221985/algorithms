#include <stdio.h>
#include <stdlib.h>

void print_array(int* a, int size);
void merge(int* left, int size_left, int* right, int size_right, int** merged);
void merge_sort_range(int* a, int i, int j, int** sorted);
void merge_sort(int* a, int size, int** sorted);

void print_array(int* a, int size)
{
	for (int i = 0; i < size; i++)
		printf("%d ", a[i]);
	printf("\n");
}

void merge(int* left, int size_left, int* right, int size_right, int** merged) {
	int i = 0;
	int j = 0;
	int k = 0;
	while (i < size_left && j < size_right)
	{
		if (left[i] < right[j])
			(*merged)[k++] = left[i++];
		else
			(*merged)[k++] = right[j++];
	}
	while (i < size_left)
		(*merged)[k++] = left[i++];
	while (j < size_right)
		(*merged)[k++] = right[j++];
}

void merge_sort_range(int* a, int i, int j, int** sorted)
{
	if (i == j)
	{
		(*sorted)[0] = a[i];
		return;
	}
	int mid = (i + j) / 2;
	int size_left = mid - i + 1;
	int size_right = j - mid;
	int* left = (int*) calloc(size_left, sizeof(int));
	merge_sort_range(a, i, mid, &left);
	int* right = (int*) calloc(size_right, sizeof(int));
	merge_sort_range(a, mid + 1, j, &right);
	merge(left, size_left, right, size_right, sorted);
	free(left);
	free(right);
}

void merge_sort(int* a, int size, int** sorted)
{
	merge_sort_range(a, 0, size - 1, sorted);
}

int main(void)
{
	//int a[] = {28, 32, 9, 20, 10, 31, 13, 29, 2, 33, 30, 25, 39, 4, 26, 12, 34, 1, 11, 27, 16, 37, 38, 21, 24, 15, 7, 3, 36, 22, 23, 14, 18, 35, 17, 0, 19, 5, 6, 8};
	//int size = sizeof(a) / sizeof(int);

	int size = 100000;
	int a[size];
	srand((unsigned) time(NULL));
	for (int i = 0; i < size; i++)
		a[i] = rand() % size;

	print_array(a, size);
	int* sorted = (int*) calloc(size, sizeof(int));
	merge_sort(a, size, &sorted);
	print_array(sorted, size);
	free(sorted);
	return 0;
}
