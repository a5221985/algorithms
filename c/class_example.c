#include <stdint.h>
#include <stdlib.h>
#include <stdio.h>

typedef struct {
    int32_t x;
    int32_t y;
    int32_t (*getX)();
    void (*setX)(int32_t _x);
    int32_t (*getY)();
    void (*setY)(int32_t _y);
} Point;

int32_t x;
int32_t y;

int32_t getX() {
    return x;
}

void setX(int32_t _x) {
    x = _x;
}

int32_t getY() {
    return y;
}

void setY(int32_t _y) {
    y = _y;
}

Point* construct() {
    Point* p = (Point*) malloc(sizeof(Point));
    p->getX = getX;
    p->setX = setX;
    p->getY = getY;
    p->setY = setY;
    return p;
}

void destroy(Point *const p) {
    free(p);
}

void execute(void (*lambda)(Point *const p)) {
    Point* p = construct();
    lambda(p);
    destroy(p);    
}

void lambda(Point *const p) {
    p->setX(10);
    p->setY(23);
    printf("(%d, %d)\n", p->getX(), p->getY());
}

int main() {
    execute(lambda);
}
