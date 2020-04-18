#include <stdio.h>
#include <stdbool.h>

struct Circular_Queue {
    int queue[10];
    int head;
    int tail;
};

bool initialize(struct Circular_Queue *circular_queue) {
    circular_queue->head = -1;
    circular_queue->tail = -1;
    return true;
}

bool is_full(struct Circular_Queue *circular_queue) {
    return (circular_queue->tail + 1) % 10 == circular_queue->head;
}

bool is_empty(struct Circular_Queue *circular_queue) {
    return circular_queue->head == -1;
}

bool is_last_element(struct Circular_Queue *circular_queue) {
    return !is_empty(circular_queue) && circular_queue->head == circular_queue->tail;
}

bool reset(struct Circular_Queue *circular_queue) {
    circular_queue->head = -1;
    circular_queue->tail = -1;
    return true;
}

bool enqueue(struct Circular_Queue *circular_queue, int item) {
    if (is_full(circular_queue))
        return false;
    circular_queue->queue[++circular_queue->tail % 10] = item;
    if (is_empty(circular_queue))
        circular_queue->head++;
    return true;    
}

bool dequeue(struct Circular_Queue *circular_queue, int *item) {
    if (is_empty(circular_queue)) {
        *item = -1;
        reset(circular_queue);
        return false;
    }
    if (is_last_element(circular_queue)) {
        *item = circular_queue->queue[circular_queue->head];
        reset(circular_queue);
        return true;
    }   
    *item = circular_queue->queue[circular_queue->head];
    circular_queue->head = (++circular_queue->head) % 10;
    return true;
}

bool print(struct Circular_Queue *circular_queue) {
    for (int i = 0; i < 10; i++) {
        printf("%d\n", circular_queue->queue[i]);
    }
    return true;
}

int main() {
    struct Circular_Queue circular_queue;

    initialize(&circular_queue);

    enqueue(&circular_queue, 1);
    enqueue(&circular_queue, 2);
    enqueue(&circular_queue, 3);
    enqueue(&circular_queue, 4);
    enqueue(&circular_queue, 5);
    enqueue(&circular_queue, 6);
    enqueue(&circular_queue, 7);
    enqueue(&circular_queue, 8);
    enqueue(&circular_queue, 9);
    enqueue(&circular_queue, 10);

    print(&circular_queue);

    int data;
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);

    enqueue(&circular_queue, 11);
    enqueue(&circular_queue, 12);

    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    dequeue(&circular_queue, &data);    
    printf("DEQUEUED ITEM: %d\n", data);
    return 0;
}
