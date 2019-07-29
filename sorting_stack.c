#include "simple_stack.h"

bool sort(Stack **source_stack, Stack **temp_stack, Stack **final_stack)
{
    if (isEmpty(source_stack))
        return false;

    Stack *current_stack = *source_stack;
    Stack *next_stack = *temp_stack;
    int min;
    pop(&current_stack, &min);

    while (!isEmpty(&current_stack))
    {
        int data;
        pop(&current_stack, &data);
        
        if (data < min)
        {
            push(&next_stack, min);
            min = data;    
        }
        else 
        {
            push(&next_stack, data);
        }

        if (isEmpty(&current_stack))
        {
            Stack *t_stack = current_stack;
            current_stack = next_stack;
            next_stack = t_stack;
            push(final_stack, min);
        }
  
        printf("min: %d\n", min);
    }
    return true;    
}

int main()
{
    Stack *source_stack = initialize();
    Stack *temp_stack = initialize();
    Stack *final_stack = initialize();

    push(&source_stack, 3);
    push(&source_stack, 7);
    push(&source_stack, 4);
    push(&source_stack, 1);
    push(&source_stack, 8);
    push(&source_stack, 9);
    push(&source_stack, 2);
    push(&source_stack, 5);
    push(&source_stack, 10);
    push(&source_stack, 6);
    
    sort(&source_stack, &temp_stack, &final_stack);

    int data;
    while(!isEmpty(&final_stack))
    {
        pop(&final_stack, &data);
        printf("%d ", data);
    }
    printf("\n");

    destroy(&source_stack);
    destroy(&temp_stack);
    destroy(&final_stack);
    return 0;
}
