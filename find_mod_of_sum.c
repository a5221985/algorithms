#include "stdio.h"

int mod_of_sum(int x, int y, int n)
{
    int z = x + y;
    return z - (n & -(z >= n));
}

int main()
{
    int x = 2;
    int y = 1;
    int n = 4;
    printf("(%d + %d) mod %d = %d\n", x, y, n, mod_of_sum(x, y, n));  
    return 0;
}
