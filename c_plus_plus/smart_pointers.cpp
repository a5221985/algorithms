#include <iostream>
#include <memory>

using namespace std;

class Entity {
private:
    int x;
    int y;
public:
    Entity() {
        cout << "Creation of Entity" << endl;
        this->x = 0;
        this->y = 0;
    }

    ~Entity() {
        cout << "Destruction of Entity" << endl;
    }

    void setX(int x) {
        this->x = x;
    }

    void setY(int y) {
        this->y = y;
    }

    int getX() {
        return this->x;
    }

    int getY() {
        return this->y;
    }

    void print() {
        cout << "(" << x << ", " << y << ")" << endl;
    }
};

int main(void) {
    {
        //unique_ptr<Entity> entity(new Entity(12, 7));
        unique_ptr<Entity> entity = make_unique<Entity>();
        entity->setX(12);
        entity->setY(7);
        entity->print();
    }

    {
        shared_ptr<Entity> sharedEntity = make_shared<Entity>();
        shared_ptr<Entity> e0 = sharedEntity;
        
        sharedEntity->setX(3);
        sharedEntity->setY(6);
        sharedEntity->print();

        e0->print();        
    } 

    {
        weak_ptr<Entity> e0;
        {
            shared_ptr<Entity> sharedEntity = make_shared<Entity>();
            e0 = sharedEntity;
            sharedEntity->setX(23);
            
            shared_ptr<Entity> s0 = e0.lock();
            s0->setX(8);
            s0->setY(14);
            s0->print();
        }
        if (e0.expired())
            cout << "e0 expired" << endl;
    }
    return 0;
}
