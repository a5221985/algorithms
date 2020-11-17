#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void generate_primes(int* primes, int size) {
    if (size == 0)
        return;
    primes[0] = 2;
    if (size == 1)
        return;
    primes[1] = 3;
    if (size == 2)
        return;
    int candidate = 0;
    bool isNotPrime = false;
    for (int i = 2; i < size; i++) {
        candidate = primes[i - 1];
        isNotPrime = false;
        do {
            candidate += 2;
            isNotPrime = false;
            for (int j = 0; j < i; j++) {
                if ((candidate % primes[j]) == 0) {
                    isNotPrime = true;
                    break;
                }
            }    
        } while (isNotPrime);
        primes[i] = candidate;
    }
}

void print(int* array, int size) {
    if (array == NULL || size < 1) {
        printf("[]");
        return;
    }
    printf("[%d", array[0]);
    for (int i = 1; i < size; i++)
        printf(", %d", array[i]);
    printf("]\n");
}

int main() {
    int size = 1000;
    int* primes = (int*) calloc(size, sizeof(int));
    if (primes == NULL) {
        printf("Cannot allocate memory for primes\n");
        return -1;
    }
    print(primes, size);

    generate_primes(primes, size);

    print(primes, size);
    free(primes);
    return 0;
}
