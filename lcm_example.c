#include "stdio.h"
#include "lcm.h"

int main()
{
	int a = 12;
	int b = 18;
	printf("LCM(%d, %d) = %d\n", a, b, lcm(a, b));
	
	int array[] = {12, 24, 36, 48, 54};
	printf("LCM_OF_ARRAY(array) = %d\n", lcm_of_array(array, 5));
	return 0;
}
