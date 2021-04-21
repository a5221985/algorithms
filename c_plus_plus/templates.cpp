#include <iostream>

using namespace std;

template<typename T, int N>
class Array {
private:
    T array[N];
public:
    Array() {}

    ~Array() {}

    void set(int index, T item) {
        array[index] = item;
    }

    void print() {
        for (int i = 0; i < N; i++)
            cout << array[i] << " ";
        cout << endl;
    }
};

int main(void) {
    Array<int, 25> a;    
    for (int i = 0; i < 25; i++)
        a.set(i, i);
    a.print();

    Array<char, 26> b;
    for (int i = 0; i < 26; i++)
        b.set(i, (char) (i + 'a'));
    b.print();

    Array<float, 10> c;
    for (int i = 0; i < 10; i++)
        c.set(i, (float) (i + 0.1));
    c.print();
    return 0;
}
