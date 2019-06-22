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

typedef struct QNode
{
        Node *node;
        struct QNode *next;
        struct QNode *prev;
} QNode;

typedef struct Queue
{
        QNode *head;
        QNode *tail;
} Queue;

bool initialize(Queue **Q);
bool destroy(Queue **Q);
bool enqueue(Queue **Q, Node **node);
bool dequeue(Queue **Q, Node **node);
bool isEmpty(Queue *Q);
