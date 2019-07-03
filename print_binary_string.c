#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

void print_binary(int a);

int main()
{
	int a = 0x80FF;

	print_binary(a);

	return 0;
}

void print_binary(int a)
{
	char *bit_string = calloc(64, sizeof(char));

	int size = 0;
	while (a > 0)
	{
		bit_string[size++] = a % 2;
		a /= 2;
	}

	for(int i = size - 1; i >= 0; i--)
		printf("%d", bit_string[i]);

	free(bit_string);
}
