#include "stdio.h"
#include "stdbool.h"
#include "stdlib.h"

int num_ways(int index, int size, char *data, char ** decodings, int *w);

int main()
{
	const char encodings[] = {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	char *data = "123241618";
	int size = 9;
	int possibilities = 100;
	int *w = calloc(size, sizeof(int));
	char **decodings = calloc(possibilities, sizeof(char*));
	
	for (int i = 0; i < possibilities; i++)
		decodings[i] = calloc(size, sizeof(char));

	printf("%d\n", num_ways(0, size, data, decodings, w));

	free(data);
	free(w);

	for (int i = 0; i < possibilities; i++)
		free(decodings[i]);

	free(decodings);
	return 0;
}

int num_ways(int index, int size, char *data, char ** decodings, int *w)
{
	if (w[index] == 0 && index >= (size - 1))
	{
		w[index] = 1;
	}
	else if (w[index] == 0)
	{
		w[index] = num_ways(index + 1, size, data, decodings, w);
		int num = (data[index] - '0') * 10 + (data[index + 1] - '0');
		if (num <= 26)
			w[index] += num_ways(index + 2, size, data, decodings, w);
	}

	return w[index];
}
