#include <stdio.h>

typedef struct Register {
    unsigned int b0 : 1;
    unsigned int b1 : 1;
    unsigned int b2 : 1;
    unsigned int b3 : 1;
    unsigned int b4 : 1;
    unsigned int b5 : 1;
    unsigned int b6 : 1;
    unsigned int b7 : 1;
    unsigned int b8 : 1;
    unsigned int b9 : 1;
    unsigned int b10 : 1;
    unsigned int b11 : 1;
    unsigned int b12 : 1;
    unsigned int b13 : 1;
    unsigned int b14 : 1;
    unsigned int b15 : 1;
    unsigned int b16 : 1;
    unsigned int b17 : 1;
    unsigned int b18 : 1;
    unsigned int b19 : 1;
    unsigned int b20 : 1;
    unsigned int b21 : 1;
    unsigned int b22 : 1;
    unsigned int b23 : 1;
    unsigned int b24 : 1;
    unsigned int b25 : 1;
    unsigned int b26 : 1;
    unsigned int b27 : 1;
    unsigned int b28 : 1;
    unsigned int b29 : 1;
    unsigned int b30 : 1;
    unsigned int b31 : 1;
} Register;

int main() {
    Register r1 = { 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0,1, 0, 1, 0, 0, 0, 0, 0,1, 0, 1, 0, 0, 0, 0, 0 };
    printf("%u\n", r1.b0);
    printf("%u\n", r1.b1);
    printf("%u\n", r1.b2);
    printf("%u\n", r1.b3);
    printf("%u\n", r1.b4);
    printf("%u\n", r1.b5);
    printf("%u\n", r1.b6);
    printf("%u\n", r1.b7);
    printf("%u\n", r1.b8);
    printf("%u\n", r1.b9);
    printf("%u\n", r1.b10);
    printf("%u\n", r1.b11);
    printf("%u\n", r1.b12);
    printf("%u\n", r1.b13);
    printf("%u\n", r1.b14);
    printf("%u\n", r1.b15);
    printf("%u\n", r1.b16);
    r1.b1 = 1;
    printf("\n\n"); 
    printf("%u\n", r1.b0);
    printf("%u\n", r1.b1);
    printf("%u\n", r1.b2);
    printf("%u\n", r1.b3);
    printf("%u\n", r1.b4);
    printf("%u\n", r1.b5);
    printf("%u\n", r1.b6);
    printf("%u\n", r1.b7);
    printf("%u\n", r1.b8);
    printf("%u\n", r1.b9);
    printf("%u\n", r1.b10);
    printf("%u\n", r1.b11);
    printf("%u\n", r1.b12);
    printf("%u\n", r1.b13);
    printf("%u\n", r1.b14);
    printf("%u\n", r1.b15);
    printf("%u\n", r1.b16);
    return 0;
}
