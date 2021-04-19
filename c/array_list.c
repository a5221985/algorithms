#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>

#define INIT_SIZE 10U

static uint32_t capacity = INIT_SIZE;
static uint32_t lastIndex = -1;

int32_t *const init();
void add(int32_t *const ptrArray, int32_t const item);
int32_t const get(int32_t *const ptrArray, uint32_t const index); 
void print(int32_t *const ptrArray);
void destroy(int32_t *const ptrArray);

int main() {
    int32_t *const ptrArray = init();

    for (uint32_t i = 0; i < 10; i++)
        add(ptrArray, i);

    print(ptrArray);

    destroy(ptrArray);
}

int32_t *const init() {
    return (int32_t *const) calloc(INIT_SIZE, sizeof(int32_t));
}

void add(int32_t *const ptrArray, int32_t const item) {
    //_resizeIfNecessary(ptrArray);
    ptrArray[++lastIndex] = item;
}

int32_t const get(int32_t *const ptrArray, uint32_t const index) {
    return ptrArray[index];
}

void print(int32_t *const ptrArray) {
    for (int i = 0; i <= lastIndex; i++)
        printf("%d ", ptrArray[i]);
    printf("\n"); 
}

void destroy(int32_t *const ptrArray) {
    free(ptrArray);
}
