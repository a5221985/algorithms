#include "stdio.h"
#define swap(type_t, a, b) ({type_t t; t = a; a = b; b = t;})

int main()
{
	int a = 25;
	int b = 34;
	printf("a = %d, b = %d\n", a, b);

	swap(int, a, b);

	printf("a = %d, b = %d\n", a, b);
	return 0;
}
