#include "stdio.h"
#include "stack.h"

int main()
{
	Stack *stack = initialize();

	Node *node1 = malloc(sizeof(Node));
	node1->data = 1;

	Node *node2 = malloc(sizeof(Node));
	node2->data = 2;
	Node *node3 = malloc(sizeof(Node));
	node3->data = 3;
	Node *node4 = malloc(sizeof(Node));
	node4->data = 4;
        
	push(&stack, &node1);

        push(&stack, &node2);

        push(&stack, &node3);

        push(&stack, &node4);

	Node *node;
        if (pop(&stack, &node))
                printf("%d ", node->data);

        if (pop(&stack, &node))
                printf("%d ", node->data);

        if (pop(&stack, &node))
                printf("%d ", node->data);

        if (pop(&stack, &node))
                printf("%d ", node->data);

        if (pop(&stack, &node))
                printf("%d ", node->data);

        if (pop(&stack, &node))
                printf("%d ", node->data);


	free(node1);
	free(node2);
	free(node3);
	free(node4);

	destroy(&stack);

	return 0;
}
