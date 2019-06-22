#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "queue.h"

bool enqueue(Queue **Q, Node **node)
{
	if (Q == NULL || (*Q) == NULL)
		return false;

	QNode *newElement = malloc(sizeof(QNode));
	if (newElement == NULL)
		return false;

	newElement->node = (*node);
	newElement->next = (*Q)->head;
	newElement->prev = NULL;

	if ((*Q)->head != NULL)
		(*Q)->head->prev = newElement;

	(*Q)->head = newElement;

	if ((*Q)->tail == NULL)
		(*Q)->tail = (*Q)->head;

	return true;
}

bool dequeue(Queue **Q, Node **node)
{
	if (Q == NULL || (*Q) == NULL)
		return false;

	if (isEmpty(*Q))
		return false;
	
	QNode *front = (*Q)->tail;
	
	if (front != NULL)
	{
		(*node) = front->node;
		free(front);
	}

	if ((*Q)->tail != NULL)
		(*Q)->tail = (*Q)->tail->prev;


	if ((*Q)->tail == NULL)
		(*Q)->head = NULL;

	return true;
}

bool initialize(Queue **Q)
{
	(*Q) = malloc(sizeof(Queue));
	(*Q)->head = NULL;
	(*Q)->tail = NULL;
}

bool destroy(Queue **Q)
{
	if (Q != NULL && (*Q) != NULL)
	{
		free(*Q);
	}
}

bool isEmpty(Queue *Q)
{
	return Q == NULL || Q->head == NULL || Q->tail == NULL;
}
