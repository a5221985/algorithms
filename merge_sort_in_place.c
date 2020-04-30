#include "stdio.h"
#include "stdlib.h"

void print(int a[], int size);
void merge_sort(int (*a)[], int size);
void sort(int (*a)[], int i, int j, int size);
void merge(int (*a)[], int i, int mid, int j);

int main()
{
    int size = 10;
    int a[size];
    srand((unsigned) time(NULL));
    for (int i = 0; i < size; i++)
        a[i] = rand() % size;
    //merge_sort(&a, size);
    print(a, size);
    return 0;
}

void merge_sort(int (*a)[], int size)
{
    sort(a, 0, size - 1, size);
}

void sort(int (*a)[], int i, int j, int size)
{
    if (size <= 1)
        return;
    int mid = (i + j) / 2;
    int left_size = mid - i + 1;
    int right_size = j - mid;
    sort(a, i, mid, left_size);
    sort(a, mid + 1, j, right_size);
    merge(a, i, mid, j);
}

void merge(int (*a)[], int i, int mid, int j)
{
    for (int m = mid + 1; m <= j; m++)
    {
        int n = m;
        while ((*a)[n] < (*a)[n - 1])
        {
            int t = (*a)[n];
            (*a)[n] = (*a)[n - 1];
            (*a)[n - 1] = t;
            n--;
        }
    }    
}

void print(int a[], int size)
{
    for (int i = 0; i < size; i++)
        printf("%d ", a[i]);
    printf("\n");
}
