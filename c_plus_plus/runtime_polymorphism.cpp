#include <iostream>

using namespace std;

// Base class
class Shape {
    public:
        // pure virtual function providing interface framework.
        virtual int getArea() = 0;

        void setWidth(int width) {
            this->width = width;
        }

        void setHeight(int height) {
            this->height = height;
        }        

    protected:
        int width;
        int height;
};

// Derived classes
class Rectangle : public Shape {
    public:
        int getArea() {
            return width * height;
        }
};

class Triangle : public Shape {
    public:
        int getArea() {
            return (width * height) / 2;
        }
};

int main(void) {
    Shape *rectangle = new Rectangle();
    Shape *triangle = new Triangle();

    rectangle->setWidth(5);
    rectangle->setHeight(7);

    cout << "Total Rectangle area: " << rectangle->getArea() << endl;

    triangle->setWidth(9);
    triangle->setHeight(8);

    cout << "Total Triangle area: " << triangle->getArea() << endl;

    delete rectangle;
    delete triangle;
    return 0;
}
