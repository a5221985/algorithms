#include <iostream>
#include <stdint.h>

using namespace std;

class A {
private:
    int32_t* ptrArray;
public:
    A(uint32_t const size) {
        cout << "Allocating memory of array" << endl;
        this->ptrArray = new int32_t [size];
    }

    ~A() {
        cout << "Freeing memory allocated to array" << endl;
        delete[] this->ptrArray;
    }
};

int main(void) {
    A a = A(30);

    return 0;
}
