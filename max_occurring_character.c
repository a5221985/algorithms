#include <stdio.h>
#include <string.h>

void print(int* array, int size) {
    if (size == 0) {
        printf("[]");
        return;
    }
    printf("[%d", array[0]);
    for (int i = 1; i < size; i++)
        printf(", %d", array[i]);
    printf("]\n");
}

char maxOccurringChar(char* str) {
    if (str == NULL)
        return '0';
    int frequency[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    printf("strlen(str): %lu\n", strlen(str));
    for (int i = 0; i < strlen(str); i++)
	frequency[str[i] - 'a']++;
    int maxFreqIndex = 0;
    for (int i = 0; i < 26; i++)
	if (frequency[maxFreqIndex] < frequency[i])
	    maxFreqIndex = i;
    print(frequency, 26);
    return (char) (maxFreqIndex + 'a');
}

int main() {
    char str[] = "abcaadbcacaaaefgah";
    printf("%c\n", maxOccurringChar(str));
    return 0;
}
