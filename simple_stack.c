#include "stdio.h"
#include "stdlib.h"
#include "stdbool.h"
#include "simple_stack.h"

Stack* initialize()
{
	Stack *stack = malloc(sizeof(Stack));
	
	if (stack != NULL)
		stack->top = NULL;

	return stack;
}

bool push(Stack **stack, int data)
{
	if (stack == NULL || (*stack) == NULL)
		return false;

	SNode *snode = malloc(sizeof(SNode));

	if (snode == NULL)
		return false;

	snode->data = data;
	snode->next = (*stack)->top;

	(*stack)->top = snode;

	return true;
}

bool pop(Stack **stack, int *data)
{
	if (isEmpty(stack))
	{
		return false;
	}

	SNode *top = (*stack)->top;
	(*data) = top->data;

	(*stack)->top = (*stack)->top->next;

	free(top);

	return true;
}


bool destroy(Stack **S)
{
        if (S != NULL && (*S) != NULL)
        {
                free(*S);
		return true;
        }
	
	return false;
}

bool isEmpty(Stack **stack)
{
	return (stack == NULL || (*stack) == NULL || (*stack)->top == NULL);
}
