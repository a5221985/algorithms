#include <stdio.h>
#include <stdlib.h>

int i_sqrt(int num) {
    if (num < 2)
        return num;
    int sqrt = 0;
    int temp_sqrt = 0;
    int p = 0;
    int prev_p = 0;
    int temp_square = 0;
    int sum = 0;
    while (temp_sqrt * temp_sqrt <= num) {
        sqrt = temp_sqrt;
	p = 1;
	prev_p = 0;
        sum = temp_sqrt + p; 
	while ((sum * sum) <= num) {
	    prev_p = p;
	    p <<= 1;
            sum = temp_sqrt + p; 
	}
        if (prev_p == 0)
            break;
	temp_sqrt += prev_p;
    }
    return sqrt;
}

int main(int argc, char** argv) {
    if (argc < 2) {
        printf("The usage is:\n\t ./integer_square_root <integer>\n");
        return 1;
    }
    int num = atoi(argv[1]);
    int sqrt = i_sqrt(num);

    printf("Integer square root of %d is %d\n", num, sqrt); 
}
