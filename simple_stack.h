#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

typedef struct SNode
{
        int data;
        struct SNode *next;
} SNode;

typedef struct Stack
{
        SNode *top;
} Stack;

Stack* initialize();
bool destroy(Stack **S);
bool push(Stack **stack, int data);
bool pop(Stack **stack, int *data);
bool isEmpty(Stack **stack);

