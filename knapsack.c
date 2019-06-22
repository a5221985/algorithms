#include "stdio.h"
#include "stdlib.h"

int max_value(int *values, int *sizes, int current_item, int current_size, int num_items, int knapsack_size);

int main()
{
	int knapsack_size = 20;
	
	// items: 1, 2, 3, 4, 5, 6
	int *values = {1, 2, 5, 3, 7, 4}
	int *sizes =  {2, 3, 1, 10, 4, 6}

	max_value(values, sizes, 6, knapsack_size);

	return 0;
}

int max_value(int *values, int *sizes, int current_item, int current_size, int num_items, int knapsack_size)
{
	int current_value = 0;
	int current_size = 0;

	return min(max_value(values, sizes, current_item + 1, current_size + sizes[current_item], num_items - 1, knapsack_size) + values[current_item], max_value(values, sizes, current_item + 1, current_size, num_items - 1, knapsack_size)); 
}

