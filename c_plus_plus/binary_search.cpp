#include <iostream>
#include <time.h>

using namespace std;

int binary_search(int* array, int size, int key) {
    int low = 0;
    int high = size - 1;
    int mid = 0;
    while (low <= high) {
        mid = (low + high) >> 1;
        if (key == array[mid])
            return mid;
        else if (key < array[mid])
            high = mid - 1;
        else
            low = mid + 1;
    }
    return -1;
}  

int main() {
    int size = 1000;
    int array[size];
    srand(time(0));
    int key = rand() % size;

    cout << "key: " << key << endl;

    for (int i = 0; i < size; i++)
        array[i] = i;

    int index = binary_search(array, size, key);

    if (index == -1)
        cout << "Not found" << endl;
    else
        cout << "index: " << index << ", array[" << index << "]: " << array[index] << endl;
}
