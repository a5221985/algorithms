#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

bool checkIfPermutations(char* str1, char* str2) {
    if (str1 == NULL && str2 == NULL)
	return true;
    if (str1 == NULL || str2 == NULL)
	return false;
    if (strcmp(str1, str2) == 0)
	return true;
    if (strlen(str1) != strlen(str2))
	return false;
    int* charFrequencyOfStr1 = (int*) calloc(26, sizeof(int));
    int* charFrequencyOfStr2 = (int*) calloc(26, sizeof(int));
    int index = 0;
    // O(n)
    for (int i = 0; i < strlen(str1); i++) {
	index = str1[i] - 'a';
        if (index >= 0 && index < 26)
	    charFrequencyOfStr1[index] = charFrequencyOfStr1[index] + 1;
    } 
    // O(n)
    for (int i = 0; i < strlen(str2); i++) {
	index = str2[i] - 'a';
        if (index >= 0 && index < 26)
	    charFrequencyOfStr2[index] = charFrequencyOfStr2[index] + 1;
    }
    // O(1)
    bool arePermutations = true;
    for (int i = 0; i < 26; i++) {
	if (charFrequencyOfStr1[i] != charFrequencyOfStr2[i]) {
	    arePermutations = false;
            break;
        }
    }
    free(charFrequencyOfStr1);
    free(charFrequencyOfStr2);
    return arePermutations;
}

int main(int argc, char** argv) {
    char* str1 = "uhbaibklp";
    char* str2 = "buiaklbhp";
    bool arePermutations = checkIfPermutations(str1, str2);
    if (arePermutations)
        printf("true\n");
    else
        printf("false\n");
    return 0;
}

