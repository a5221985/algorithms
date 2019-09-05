#include "stdio.h"

int main()
{
	for (int i = 0; i < 10; i++)
	{
		int gap = 10 - i;
		for (int j = 0; j < gap; j++)
			printf(" ");

		for (int j = 0; j < i; j++)
			printf("* ");
		printf("\n");
	}

	for (int i = 10; i > 0; i--)
	{
		int gap = 10 - i;
		for (int j = 0; j < gap; j++)
			printf(" ");

		for (int j = 0; j < i; j++)
			printf("* ");
		printf("\n");
	}

	return 0;
}
