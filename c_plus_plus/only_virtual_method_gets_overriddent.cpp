#include <iostream>

using namespace std;

class Base
{
public:
    void show() 
    //virtual void show() 
    {
        cout << "Base::show() called" << endl;
    }
};

class Derived: public Base {
public:
    void show() {
        cout << "Derived::show() called" << endl;
    }
};

int main()
{
    Derived d;
    Base &b = d;
    b.show();
    return 0;
}
