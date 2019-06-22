#include "stdio.h"
#include "stdlib.h"

int num_ways(int max_step_length, int steps, int *w);

int main()
{
	int max_step_length = 2;
	int steps = 10;
	int *w = calloc(steps, sizeof(int));

	int ways = num_ways(max_step_length, steps, w);

	printf("%d\n", ways);

	free(w);
	return 0;
}

int num_ways(int max_step_length, int steps, int *w)
{
	if (steps >= 1 && w[steps - 1] != 0)
		return w[steps - 1];

	if (steps <= 1)
	{
		w[steps - 1] = 1;
	}
	else if (steps > 1)
	{
		w[steps - 1] = 0;
		for (int i = 1; i <= max_step_length; i++) {
			w[steps - 1] += num_ways(max_step_length, steps - i, w);
		}
	}

	return w[steps - 1];
}
