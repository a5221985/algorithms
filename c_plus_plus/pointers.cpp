#include <iostream>

using namespace std;

int main() {
    int* p = nullptr;
    p = new int [20];
    memset(p, -1, 20 * sizeof(int));
    cout << "[" << p[0];
    for (int i = 1; i < 20; i++)
        cout << ", " << p[i];
    cout << "]" << endl;
    delete[] p;
}
