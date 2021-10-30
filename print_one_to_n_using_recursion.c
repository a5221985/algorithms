#include <stdio.h>

void print_one_to_n(int n) {
	print_one_to_n_recursively(n);
	printf("\n");
}

void print_one_to_n_recursively(int n) {
	if (n < 1)
		return;
	if (n == 1) {
		printf("%d ", n);
		return;
	}
	print_one_to_n(n - 1);
	printf("%d ", n);
}

int main() {
	int n = 10;
	print_one_to_n(n);
}
