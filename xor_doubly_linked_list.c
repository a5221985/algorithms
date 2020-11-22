#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int val;
    long xor;   
} Node;

void traverse(Node* head) {
    Node* current = head;
    while (current != NULL) {
        printf("%d ", current->val);
        current = (Node*) (((long) current) ^ current->xor);
    }
    printf("\n");
}

int main() {
    Node* head = (Node*) malloc(sizeof(Node));
    Node* node1 = (Node*) malloc(sizeof(Node));
    head->val = 1;
    head->xor = ((long) head) ^ ((long) node1);
    Node* node2 = (Node*) malloc(sizeof(Node));
    node1->val = 2;
    node1->xor = ((long) node1) ^ ((long) node2);
    Node* node3 = (Node*) malloc(sizeof(Node));
    node2->val = 3;
    node2->xor = ((long) node2) ^ ((long) node3);
    Node* node4 = (Node*) malloc(sizeof(Node));
    node3->val = 4;
    node3->xor = ((long) node3) ^ ((long) node4);
    Node* node5 = (Node*) malloc(sizeof(Node));
    node4->val = 5;
    node4->xor = ((long) node4) ^ ((long) node5);
    Node* node6 = (Node*) malloc(sizeof(Node));
    node5->val = 6;
    node5->xor = ((long) node5) ^ ((long) node6);
    node6->val = 7;
    node6->xor = ((long) node6) ^ ((long) NULL);

    traverse(head);

    free(node6);
    free(node5);
    free(node4);
    free(node3);
    free(node2);
    free(node1);
    free(head);
}
