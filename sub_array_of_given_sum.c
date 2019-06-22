#include "stdio.h"
#include "stdlib.h"

int* find_sub_array_of_given_sum(int *array, int sum);
void print_array(int *array);
int* copy(int *array, int lower, int upper);

int main()
{
	int array[] = {1, 2, 3, 7, 5, '\0'};
	int sum = 13;

	int *sub_array = find_sub_array_of_given_sum(array, sum);

	print_array(array);
	print_array(sub_array);

	if (sub_array != NULL)
		free(sub_array);
}

int* find_sub_array_of_given_sum(int *array, int sum)
{
	int lower = 0;
	int upper = 0;

	int current_sum = array[lower];

	while (current_sum < sum && upper <= sizeof(array))
	{
		current_sum += array[++upper];
	}

	while (current_sum > sum && lower <= sizeof(array))
	{
		current_sum -= array[lower++];
	}


	if (current_sum == sum)
	{
		printf("lower = %d, upper = %d\n", lower, upper);
		int *sub_array = copy(array, lower, upper);
	}
	else 
	{
		return NULL;
	}
}

void print_array(int* a)
{
	int i = 0;
	while (a[i] != '\0')
	{
		printf("%d ", a[i++]);
	}

	printf("\n");
}

int* copy(int *a, int lower, int upper)
{
	int size = upper - lower + 1;
	int *sub_array = calloc(size + 1, sizeof(int));

	printf("size of: %d\n", sizeof(sub_array));

	for (int i = 0; i < size; i++)
	{
		sub_array[i] = a[lower + i];
	}

	sub_array[size] = '\0';

	return sub_array;
}
