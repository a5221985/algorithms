#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>

#define SIZEOF(a) ((sizeof(a)) / (sizeof(a[0]))) 

uint32_t quickSelect(uint32_t *const a, uint32_t const size, uint32_t k);
static uint32_t _quickSelect(uint32_t *const a, uint32_t const low, uint32_t high, uint32_t k); 
static uint32_t _partition(uint32_t *const a, uint32_t const low, uint32_t high); 
static void _swap(uint32_t *const a, uint32_t const i, uint32_t const j);
void print(uint32_t const *const a, uint32_t const size);

int main(int argc, char** argv) {
    if (argc < 2) {
        printf("Usage is:\n\tquick_select <k-th-element>\n");
        exit(-1);
    }

    uint32_t a[] = {9, 0, 1, 4, 2, 8, 5, 3, 6, 7};
    uint32_t size = SIZEOF(a);
    print(a, size);

    uint32_t k = atoi(argv[1]);

    uint32_t item = quickSelect(a, size, k);
    print(a, size);
    printf("%u: %u\n", k, item); 
}

uint32_t quickSelect(uint32_t *const a, uint32_t const size, uint32_t k) {
    printf("%u\n", size);
    return _quickSelect(a, 0, size - 1, k);
}

static uint32_t _quickSelect(uint32_t *const a, uint32_t const low, uint32_t high, uint32_t k) {
    uint32_t p = _partition(a, low, high);
    if (k == p)
        return a[k];
    else if (k < p)
        return _quickSelect(a, low, high - 1, k);
    else
        return _quickSelect(a, low + 1, high, k); 
}

static uint32_t _partition(uint32_t *const a, uint32_t const low, uint32_t high) {
    uint32_t pivot = a[low];
    uint32_t i = low + 1;
    uint32_t j = high;
    while (i < j) {
        if (a[i] <= pivot)
            i++;
        if (a[j] >= pivot)
            j--;
        if (a[i] > pivot && a[j] < pivot)
            _swap(a, i, j);
    }
    uint32_t p = 0;
    if (i > 0 && a[i] > pivot)
        p = i - 1;
    else
        p = i;
    _swap(a, low, p);
    return p;
}

static void _swap(uint32_t *const a, uint32_t const i, uint32_t const j) {
    uint32_t temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

void print(uint32_t const *const a, uint32_t const size) {
    printf("Array:\n");
    for (int i = 0; i < size; i++)
        printf("%u ", a[i]);
    printf("\n");
}
