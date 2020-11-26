#include <iostream>

using namespace std;

class Entity {
public:
    static int x;
    static int y;

    static void print() {
        cout << "x: " << x << ", y: " << y << endl;
    }
};
int Entity::x;
int Entity::y;

int main() {
    Entity::x = 25;
    Entity::y = 56;
    Entity::print();
}
