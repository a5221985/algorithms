#include "stdio.h"
#include "stdlib.h"

int fibonacci(int n);
int *fib;
int even_sum = 0;

int main()
{
    int n = 10;

    fib = (int*) calloc(1000, sizeof(int));

    if (fib == NULL)
    {
        printf("Cannot allocate memory\n");
	return 1;
    }

    printf("%d\n", fibonacci(1000));
    printf("%d\n", even_sum);

    free(fib);

    return 0;
}

int fibonacci(int n)
{
    if (fib[n - 1] != 0)
    {
	 return fib[n - 1];
    }

    if (n == 1 || n == 2)
    {
	fib[n - 1] = n;
    }
    else 
    {
        fib[n - 1] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    if (fib[n - 1] <= 4000000 && fib[n - 1] % 2 == 0) 
    {
	even_sum += fib[n - 1];
    }

    return fib[n - 1];
}
