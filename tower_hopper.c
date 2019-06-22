#include "stdio.h"
#include "stdbool.h"
#include "stdlib.h"

bool is_hoppable(int index, int size, int *towers, bool *h);

int main()
{
	int size = 6;
	int *towers = malloc(sizeof(int) * 6);
	bool *h = calloc(6, sizeof(bool));
	towers[0] = 4;
	towers[1] = 0;
	towers[2] = 0;
	towers[3] = 0;
	towers[4] = 0;
	towers[5] = 0;

	printf(is_hoppable(0, 6, towers, h) ? "true": "false");

	free(towers);
	free(h);
	return 0;
}

bool is_hoppable(int index, int size, int *towers, bool *h)
{
	if (!h[index] && (index >= (size - 1))) 
	{
		h[index] = (towers[index] >= 0);
	}
	else if (!h[index])
	{
		for (int i = 1; i <= towers[index]; i++) {
			h[index] = h[index] || is_hoppable(index + i, size, towers, h);
		}
	}

	return h[index];
}
