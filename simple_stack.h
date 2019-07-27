#ifndef _SIMPLE_STACK_H_
#define _SIMPLE_STACK_H_

	#include "stdio.h"
	#include "stdlib.h"
	#include "stdbool.h"

	/* 
	 * Linked list node
	 * data - content
	 * next - pointer to next node in linked list
	 */
	typedef struct SNode
	{
		int data;
		struct SNode *next;
	} SNode;

	/* 
	 * Stack containing top element
	 * top - points to last pushed element
	 */
	typedef struct Stack
	{
		SNode *top;
	} Stack;

	/* constructs a stack and returns a pointer to it */
	Stack* initialize();

	/* 
	 * de-constructs a stack clearing memory 
	 * S - stack which needs to be de-constructed
	 * returns true if successful or else returns false
	 */
	bool destroy(Stack **S);

	/* pushes an element into stack 
	 * stack - stack to push elements onto
	 * data - element to push onto the stack
	 * returns true if successful or else returns false
	 */
	bool push(Stack **stack, int data);

	/* 
	 * pops an element from stack
	 * stack - stack from which to pop elements
	 * data - popped element is stored in this variable
	 * returns true if successful or else returns false
	 */
	bool pop(Stack **stack, int *data);

	/*
	 * Returns the value of top element from stack without popping it
	 * stack - stack from which to peek element
	 * data - peeked element is stored in this variable
	 * returns true if successful or else returns false
	 */
	bool peek(Stack **stack, int *data);

	/* 
	 * Checks if stack is empty
	 * stack - stack to check
	 * returns true if stack is empty or else returns false
	 */
	bool isEmpty(Stack **stack);

#endif
