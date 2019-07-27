#include "simple_stack.h"

bool enqueue(Stack **enqueuing_stack, int data)
{
    return push(enqueuing_stack, data);    
}

bool dequeue(Stack **enqueuing_stack, Stack **dequeuing_stack, int *data)
{
    if (isEmpty(dequeuing_stack))
    {
        while (!isEmpty(enqueuing_stack))
        {
            int val;
            pop(enqueuing_stack, &val); 
            push(dequeuing_stack, val);
        }
    }

    if (!isEmpty(dequeuing_stack))
    {
        pop(dequeuing_stack, data);
        return true;
    } else
        return false;
}

int main()
{
    Stack *enqueuing_stack = initialize();
    Stack *dequeuing_stack = initialize();

    for (int i = 0; i < 100; i++)
        enqueue(&enqueuing_stack, i);

    int item;
    while (!isEmpty(&enqueuing_stack) || !isEmpty(&dequeuing_stack))
    {
        dequeue(&enqueuing_stack, &dequeuing_stack, &item);
        printf("%d ", item);
    }
    printf("\n");

    destroy(&enqueuing_stack);
    destroy(&dequeuing_stack);
    return 0;
}
