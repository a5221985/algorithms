#include "stdio.h"
#include "stdlib.h"

void print(int a[], int size);
void quick_sort(int *a[], int size);
void sort(int *a[], int i, int pivot, int j);
void re_arrange(int *a[], int i, int pivot, int j);
void swap(int *a[], int m, int n);

int main()
{
    int a[] = {9, 4, 6, 1, 8, 2, 3, 7, 5};
    quick_sort(&a, 9);
    print(a, 9);
    return 0;
}

void print(int a[], int size)
{
    for (int i = 0; i < size; i++)
        printf("%d ", a[i]);
    printf("\n");
}

void quick_sort(int *a[], int size)
{
    int pivot = (size - 1) / 2;
    sort(a, 0, pivot, size - 1);
}

void sort(int *a[], int i, int pivot, int j)
{
    re_arrange(a, i, pivot, j);
    int pivot_left = (i + pivot) / 2;
    int pivot_right = (pivot + 1 + j) / 2;
    sort(a, i, pivot_left, pivot - 1);
    sort(a, pivot + 1, pivot_right, j);
}

void re_arrange(int *a[], int i, int pivot, int j)
{
    int m = i;
    int n = j;
    while (m < n)
    {
        if ((*a)[m] < (*a)[pivot])
            m++;
        if ((*a)[n] > (*a)[pivot])
            j--;
        if ((*a)[m] > (*a)[pivot] && (*a)[n] < (*a)[pivot])
            swap(a, m, n);
    }
}

void swap(int *a[], int m, int n)
{
    int t = (*a)[m];
    (*a)[m] = (*a)[n];
    (*a)[n] = t;
}
