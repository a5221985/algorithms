#include "stdio.h"
#include "stdlib.h"

char findRepeatingLetter(char *array);

int main()
{
	char *array = malloc(sizeof(char) * 10);

	array[0] = 'B';
	array[1] = 'C';
	array[2] = 'A';
	array[3] = 'B';
	array[4] = 'A';

	char repeating_letter = findRepeatingLetter(array);

	printf("%c\n", repeating_letter);

	free(array);
	return 0;
}

char findRepeatingLetter(char *array)
{
	int *set = malloc(sizeof(int) * 26);

	char letter;
	for (int i = 0; i < 10; i++)
	{
		letter = array[i];
		int index = letter - 'A';

		if (set[index] == 0)
		{
			set[index]++;
		}
		else
		{
			break;
		}
	}

	free(set);

	return letter;
}
