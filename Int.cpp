#include <stdio.h>

class Int {
   private:
   int x;
   public:
   Int(int x);
   ~Int(); 
   int getValue();
   void setValue(int x);
};

Int::Int(int x) {
    this->x = x;
}

Int::~Int() {
}

int Int::getValue() {
    return x;
}

void Int::setValue(int x) {
    if (x < 0)
        return;
    this->x = x;
}

int main(int argc, char** argv) {
    Int *a = new Int(20);
    printf("%d\n", a->getValue());
    delete a;
}
