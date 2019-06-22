#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"

typedef struct Node 
{
    int data;
    struct Node *next;
    struct Node *prev;
} Node;

bool enqueue(Node **head, Node **tail, int *data);
bool dequeue(Node **head, Node **tail, int *data);

int main()
{
    Node *head;
    Node *tail;
    int data = 1;

    int i;
    bool isNotFull = true;
    for (i = 0; i < 10 && isNotFull; i++)
    {
        isNotFull = enqueue(&head, &tail, &i);
	//printf("i = %d\n", i);
    }

    /*while (dequeue(&head, &tail, &data))
    {
        printf("%d\n", data);
    }*/

    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);
    dequeue(&head, &tail, &data);
    printf("%d\n", data);

    return 0;
}

bool enqueue(Node **head, Node **tail, int *data)
{
    Node *newNode = malloc(sizeof(struct Node));
    
    if (newNode == NULL)
    {
         printf("The Queue is full\n");
	 return false;
    }

    newNode->data = *data;
    newNode->next = *head;
    (*head)->prev = newNode;
    (*head) = newNode;

    if ((*tail) == NULL)
    {
	(*tail) = (*head);
    }

    return true;
}

bool dequeue(Node **head, Node **tail, int *data)
{
    if (head == NULL || (*head) == NULL || tail == NULL || (*tail) == NULL)
    {
        printf("The Queue is empty\n");
	return false;
    }

    (*data) = (*tail)->data;
    Node *current = (*tail);
    (*tail) = (*tail)->prev;

    if ((*tail) == NULL) {
	(*head) = NULL;    
    } else if (current != NULL) {
	free(current);
    }

    return true;
}

