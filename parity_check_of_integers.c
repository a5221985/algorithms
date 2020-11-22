#include <stdio.h>

int check_parity(val) {
    int parity = 0;
    int mask = 1;
    while (val > 0) {
        parity ^= val & mask;
        val >>= 1;
    }
    return parity;
}

int main() {
    int val = 24;
    int parity = check_parity(val);
    printf("Parity of %d is %d\n", val, parity);
}
