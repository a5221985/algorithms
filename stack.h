#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

typedef struct Node
{
        int data;
        struct Node *left;
        struct Node *right;
        bool visited;
} Node;

typedef struct SNode
{
        Node *node;
        struct SNode *next;
} SNode;

typedef struct Stack
{
        SNode *top;
} Stack;

Stack* initialize();
bool destroy(Stack **S);
bool push(Stack **stack, Node **node);
bool pop(Stack **stack, Node **node);
bool isEmpty(Stack **stack);

