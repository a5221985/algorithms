#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "stack.h"

Stack* initialize()
{
	Stack *stack = malloc(sizeof(Stack));
	
	if (stack != NULL)
		stack->top = NULL;

	return stack;
}

bool push(Stack **stack, Node **node)
{
	if (stack == NULL || (*stack) == NULL || node == NULL || (*node) == NULL)
		return false;

	SNode *snode = malloc(sizeof(SNode));

	if (snode == NULL)
		return false;

	snode->node = *node;
	snode->next = (*stack)->top;

	(*stack)->top = snode;

	return true;
}

bool pop(Stack **stack, Node **node)
{
	if (isEmpty(stack))
	{
		return false;
	}

	SNode *top = (*stack)->top;
	(*node) = top->node;

	(*stack)->top = (*stack)->top->next;

	free(top);

	return true;
}


bool destroy(Stack **S)
{
        if (S != NULL && (*S) != NULL)
        {
                free(*S);
        }
}

bool isEmpty(Stack **stack)
{
	return (stack == NULL || (*stack) == NULL || (*stack)->top == NULL);
}
