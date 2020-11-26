#include <iostream>

using namespace std;

void manipulate(int& a, int p) {
    a += p;
}

int main() {
    int a = 10;
    int& b = a;

    cout << "a: " << a << ", b: " << b << endl;
    b = 23;
    cout << "a: " << a << ", b: " << b << endl;

    int p = 4;
    cout << "a: " << a << ", p: " << p << endl;
    manipulate(a, p);
    cout << "a: " << a << ", p: " << p << endl;
    manipulate(a, p);
    cout << "a: " << a << ", p: " << p << endl;
}
