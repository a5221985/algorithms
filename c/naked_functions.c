#include <stdio.h>
#include <stdint.h>

int32_t _add_c(int32_t sum);

// convention: params are stored in {RDI, RSI, RDX, R10, R8, R9} 
__attribute__((naked)) int32_t add(int32_t a, int32_t b) {
    __asm volatile ("addl %esi, %edi");
    __asm volatile ("jmp *%0"::"r"(_add_c));
}

int32_t _add_c(int32_t sum) {
    return sum;
}

int main() {
    int32_t a = 23;
    int32_t b = 84;
    int32_t sum = add(a, b);
    printf("%d\n", sum);
}
