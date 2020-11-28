#include <iostream>

using namespace std;

class Entity
{
public:
    float x, y;

    Entity()
    {
        x = 0.0f;
        y = 0.0f;
        cout << "Constructed entity!" << endl;
    }

    Entity(float x, float y)
    {
        this->x = x;
        this->y = y;
        cout << "Constructed entity!" << endl;
    }

    ~Entity()
    {
        cout << "Destroyed entity!" << endl;
    }

    void print()
    {
        cout << x << ", " << y << endl;
    }
};

int main()
{
    Entity e;
    e.print();

    Entity e1(3.4f, 5.6f);
    e1.print();
}
