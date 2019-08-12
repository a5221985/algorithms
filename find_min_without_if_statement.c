#include "stdio.h"

int find_min(int x, int y)
{
    return y ^ ((x ^ y) & -(x < y));
}

int main()
{
    int x = 2;
    int y = 5;

    printf("MIN(%d, %d) = %d\n", x, y, find_min(x, y));

    return 0;
}
