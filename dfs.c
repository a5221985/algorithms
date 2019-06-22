#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "dfs.h"

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
	node->data =data;
	node->left = NULL;
	node->right = NULL;

	if (parent != NULL && (*parent) != NULL)
		(*parent)->right = node;

	node->visited = false;
	return node; 
}

void dfs(Node *root)
{
	if (root == NULL)
		return;

	Stack *S = initialize();

	printf("%d ", root->data);

	root->visited = true;
	bool done = push(&S, &root);

	algorithm(&S);

	destroy(&S);
}

void algorithm(Stack **S)
{
	while (!isEmpty(S))
	{
		Node *node;
		pop(S, &node);

		if (node != NULL)
		{
			Node *left = node->left;
			Node *right = node->right;
		
			if (left != NULL)
			{
				printf("%d ", left->data);
				left->visited = true;
				push(S, &left);
			}
		
			if (right != NULL)
			{
				printf("%d ", right->data);
				right->visited = true;
				push(S, &right);
			}
		}
	}
}
