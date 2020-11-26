#include <iostream>

using namespace std;

int main() {
    char* buffer = new char[8];
    memset(buffer, 'a', 8);
    for (int i = 0; i < 8; i++)
        cout << buffer[i] << " ";
    cout << endl;
    delete[] buffer;
}
