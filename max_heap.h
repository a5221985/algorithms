#include "stdlib.h"
#include "stdbool.h"

#define INITIAL_SIZE 20
#define INCREMENT_FACTOR 0.75

typedef struct Heap
{
        int size;
        int *array;
} Heap;

Heap* initialize();
bool destroy(Heap **heap);
bool expand_if_necessary(Heap **heap);
bool insert(Heap **heap, int *data);
bool delete(Heap **heap);
bool propagate(Heap **heap, int index);
bool swap(int **array, int i, int j);
bool swap_vals(int **array, int index, int *val);
bool fill_hole(Heap **heap);
bool shift(Heap **heap);
void print(Heap **heap);
bool get_max(Heap **heap, int *data);
bool propagate_leaf(Heap **heap, int leaf);

