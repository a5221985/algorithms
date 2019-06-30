#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

#define M 10

int *a = NULL;
int size = M;
int in = 0;
int* initialize();
bool insert(int **a, int *size, int x);
bool delete(int **a, int size, int *x);
bool print(int *a, int size);
bool destroy(int *a);

int main()
{
	int *a = initialize();

	for(int i = 0; i < 200; i++)
		insert(&a, &size, i);

	print(a, in);

	destroy(a);
	return 0;
}

int* initialize()
{
	int *a = calloc(M, sizeof(int));
	return a;
}

bool insert(int **a, int *size, int x)
{
	if (a == NULL || *a == NULL)
		return false;

	if ((in + 1) % M == 0)
		(*size) = 2 * (*size);
		(*a) = realloc((*a), sizeof(int) * (*size));

	if (*a == NULL)
		return false;

	(*a)[in++] = x;
}

bool print(int *a, int size)
{
	for (int i = 0; i < size; i++)
		printf("%d ", a[i]);

	printf("\n");
}

bool destroy(int *a)
{
	free(a);
}
