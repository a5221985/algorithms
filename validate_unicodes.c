#include <stdio.h>
#include <stdint.h>

void copyData(uint8_t array[], uint8_t size, uint8_t copy[]);
uint8_t getSize(uint8_t array[]);

int main() {
    uint8_t array[2] = {0xAB, 0x96};

    uint8_t size = sizeof(array) / sizeof(array[0]);
    uint8_t mask1 = (uint8_t)((uint8_t)(-1) << (uint8_t)(7 - size));
    uint8_t mask2 = (uint8_t)((uint8_t)(-1) << (uint8_t)6);
    uint8_t mask3 = mask1 << 1;
    uint8_t mask4 = mask2 << 1;

    printf("mask1 = 0x%X\n", mask1);
    printf("mask2 = 0x%X\n", mask2);
    printf("mask3 = 0x%X\n", mask3);
    printf("mask4 = 0x%X\n", mask4);
    
    uint8_t copy[size];
    copyData(array, size, copy);
 
    return 0;
}

void copyData(uint8_t array[], uint8_t size, uint8_t copy[]) {
    for (int i = 0; i < size; i++)
        copy[i] = array[i];
}
