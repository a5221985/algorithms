#include "stdio.h"
#include "stdlib.h"

#define GEN_PRINT(TYPE, SPECIFIER_STR) int print_##TYPE(TYPE x) { return printf(SPECIFIER_STR "\n", x);}
GEN_PRINT(int, "%d");
GEN_PRINT(char, "%c");
GEN_PRINT(float, "%f");

int main(int argc, char **argv)
{
	int i = 1;
	float f = 0.1;
	char s[] = "s";

	print_any(i);
	print_any(f);
	print_any(s);
	return 0;
}
