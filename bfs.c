#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "queue.h"
#include "bfs.h"

Node* generate_left_node(int data, Node **parent)
{
	Node *node = malloc(sizeof(Node));
	node->data = data;
	node->left = NULL;
	node->right = NULL;

	if (parent != NULL && (*parent) != NULL)
		(*parent)->left = node;

	node->visited = false;
	return node; 
}

Node* generate_right_node(int data, Node **parent)
{
	Node *node = malloc(sizeof(Node));
	node->data = data;
	node->left = NULL;
	node->right = NULL;

	if (parent != NULL && (*parent) != NULL)
		(*parent)->right = node;

	node->visited = false;
	return node; 
}

void bfs(Node *root)
{
	if (root == NULL)
		return;

	Queue *Q;
	initialize(&Q);

	printf("%d ", root->data);

	root->visited = true;
	bool done = enqueue(&Q, &root);

	algorithm(&Q);

	destroy(&Q);
}

void algorithm(Queue **Q)
{
	while (!isEmpty(*Q))
	{
		Node *node;
		dequeue(Q, &node);

		if (node != NULL)
		{
			Node *left = node->left;
			Node *right = node->right;
		
			if (left != NULL)
			{
				printf("%d ", left->data);
				left->visited = true;
				enqueue(Q, &left);
			}
		
			if (right != NULL)
			{
				printf("%d ", right->data);
				right->visited = true;
				enqueue(Q, &right);
			}
		}
	}
}
