#include <iostream>

using namespace std;

class Coordinate {
private:
    int x;
    int y;
public:
    Coordinate() {};
    Coordinate(int x, int y) {
        this->x = x;
        this->y = y;
    };
    Coordinate operator +(Coordinate b) {
        Coordinate c;
        c.x = x + b.x;
        c.y = y + b.y;
        return c;
    };
    void print() {
        cout << "(" << this->x << ", " << this->y << ")" << endl;
    };
};

int main() {
    Coordinate a = Coordinate(1, 2);
    Coordinate b = Coordinate(3, 4);

    Coordinate c = a + b;
    a.print();
    b.print();
    c.print();
    return 0;
}
