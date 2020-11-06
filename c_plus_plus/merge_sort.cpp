#include <iostream>
#include <time.h>

using namespace std;

void print(int* array, int size);
int generate_random_array(int* array, int size);
int merge_sort(int* sorted, int* array, int size);
int merge_sort(int* sorted, int* array, int i, int j);
int merge(int* sorted, int* left, int size_left, int* right, int size_right); 

void print(int* array, int size) {
    for (int i = 0; i < size; i++)
        cout << array[i] << " ";
    cout << endl;
}

int generate_random_array(int* array, int size) {
    srand(time(0));
    for (int i = 0; i < size; i++) {
        array[i] = rand() % size;
    }
    return 0;
}

int merge_sort(int* sorted, int* array, int size) {
    return merge_sort(sorted, array, 0, size - 1);
}

int merge_sort(int* sorted, int* array, int i, int j) {
    int size = (j - i + 1); 

    if (size < 1)
        return 0;

    if (size < 2) {
        sorted[0] = array[i];
        return 0;
    }

    int mid = (i + j) >> 1;
    int size_left = mid - i + 1;
    int size_right = size - size_left;
    
    int* sorted_left = (int*) calloc(size_left, sizeof(int));
    int* sorted_right = (int*) calloc(size_right, sizeof(int));

    merge_sort(sorted_left, array, i, mid);
    merge_sort(sorted_right, array, mid + 1, j);

    merge(sorted, sorted_left, size_left, sorted_right, size_right);
   
    free(sorted_left);
    free(sorted_right);

    return 0;
}

int merge(int* sorted, int* left, int size_left, int* right, int size_right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < size_left && j < size_right) {
        if (left[i] <= right[j])
            sorted[k++] = left[i++];
        else
            sorted[k++] = right[j++];
    }

    while (i < size_left)
        sorted[k++] = left[i++];

    while (j < size_right)
        sorted[k++] = right[j++];

    return 0;
}

int main() {
    int size = 100000;
    int* array = (int*) calloc(size, sizeof(int));

    generate_random_array(array, size);
    print(array, size);

    int* sorted = (int*) calloc(size, sizeof(int));
    merge_sort(sorted, array, size);
    print(sorted, size);

    free(sorted);
    free(array);
}
