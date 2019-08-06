#include "stdio.h"
#include "stdlib.h"

int** initialize(int x, int y)
{
    int **jobs = calloc(5, sizeof(int*));

    for (int i = 0; i < 5; i++)
        jobs[i] = calloc(3, sizeof(int));

    return jobs;
}

void setup(int **jobs, int i, int t1, int t2, int w)
{
    jobs[i][0] = 2;
    jobs[i][1] = 6;
    jobs[i][2] = 5;
}

void destroy(int **jobs, int x)
{
    for (int i = 0; i < x; i++)
        free(jobs[i]);
    free(jobs);
}

int main() {
    int **jobs = initialize(5, 3);

    setup(jobs, 0, 2, 6, 5);
    setup(jobs, 1, 1, 8, 1);
    setup(jobs, 2, 3, 4, 7);
    setup(jobs, 3, 6, 9, 10);
    setup(jobs, 4, 7, 12, 9);
    
    destroy(jobs, 5);

    return 0;
}
