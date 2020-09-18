#include <stdio.h>
#include <stdlib.h>

inline int eval(int x, int y, int b) {
    int p = (0 - b);
    return ((x & p) | (y & (~p)));
}

int main(int argc, char** argv) {
    int x = atoi(argv[1]);
    int y = atoi(argv[2]);
    int b = atoi(argv[3]);
    int result = eval(x, y, b);
    printf("%d\n", result);
    return 0;
}
